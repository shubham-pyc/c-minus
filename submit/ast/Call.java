package submit.ast;

import java.util.List;
import submit.*;

public class Call implements Expression {
	final private String ID;
	final private List<Expression> expression;

	public Call(String ID, List<Expression> expression) {
		this.ID = ID;
		this.expression = expression;

	}

	public void toCminus(StringBuilder builder, final String prefix) {

		// builder.append(prefix);

		builder.append(ID).append("(");

		for (Expression e : this.expression) {
			e.toCminus(builder, prefix);
			builder.append(", ");
		}
		if (this.expression.size() > 0)
			builder.delete(builder.length() - 2, builder.length());

		builder.append(")");

	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		MIPSResult returnValue = MIPSResult.createVoidResult();

		if (this.ID.equals("println")) {
			MIPSResult res = this.expression.get(0).toMIPS(code, data, symbolTable, regAllocator);

			// String instruction = "1";
			if (res.getType() == VarType.CHAR || res.getType() == VarType.STRING) {
				// instruction = "4";
				if (res.isAddress()) {
					code.append(String.format("la $a0 %s\n", res.getAddress()));
					code.append("li $v0 4\nsyscall\n");

				} else if (res.isRegister()) {
				}

			} else if (res.getType() == VarType.INT) {
				if (res.isAddress()) {
					res = regAllocator.writeLoadAddress(code, regAllocator, res);
				}

				code.append(String.format("move $a0 %s\n", res.getRegister()));
				code.append("li $v0 1\nsyscall\n");
				// code.append(String.format(""))
			}

			code.append("la $a0 newline\nli $v0 4\nsyscall\n");

			if (res.isRegister()) {
				regAllocator.clear(res.getRegister());
			}

			// regAllocator.clear(res.getRegister());
			return MIPSResult.createVoidResult();
		} else {

			String register = regAllocator.getAny();
			code.append(String.format("move %s $ra\n", register));

			// System.out.println("Checking base offset: " + symbolTable.getBaseOffset());

			// Save all the registers
			int offset = regAllocator.saveRestore(code, symbolTable.getBaseOffset(), false, true);
			int previousBase = symbolTable.getBaseOffset();
			symbolTable.incrementCalloffset(-offset);
			int resetOffset = symbolTable.getBaseOffset();

			int paramOffset = -offset;

			// Evaluate paramters
			code.append("# Param Eval:\n");
			for (Expression e : this.expression) {

				MIPSResult res = e.toMIPS(code, data, symbolTable, regAllocator);

				if (res.getType() == VarType.INT) {
					if (res.isAddress()) {
						res = regAllocator.writeLoadAddress(code, regAllocator, res);
					}

					paramOffset -= 4;
					symbolTable.incrementCalloffset(-4);
					// Store parameters on the stack
					code.append(String.format("sw %s %d($sp)\n", res.getRegister(), symbolTable.getBaseOffset()));
					regAllocator.clear(res.getRegister());

				} else {
					System.out.println("Arugmnet passing for string not implemented yet");
					// throw new Exception("Argument passing for string not implemented yet");
				}

			}

			// code.append("addi $sp $sp ").append(-offset).append("\n");
			code.append("addi $sp $sp ").append(resetOffset).append("\n");
			code.append("jal " + this.ID + " \n");
			code.append("addi $sp $sp ").append(-resetOffset).append("\n");

			regAllocator.saveRestore(code, previousBase, false, false);
			code.append(String.format("move $ra %s \n", register));
			regAllocator.clear(register);

			// Get Return value of the stack

			SymbolInfo fun = symbolTable.find(this.ID);
			VarType type = fun.getType();
			if (type != null) {
				if (type == VarType.INT) {
					register = regAllocator.getAny();
					// System.out.println("checking offset: " + offset);
					// int returnOffset = paramOffset - 4;
					symbolTable.incrementCalloffset(-4);
					paramOffset -= 4;
					code.append("#checking return value \n");
					code.append(String.format("lw %s %d($sp)\n", register, symbolTable.getBaseOffset()));
					// symbolTable.setCallOffset(0);
					returnValue = MIPSResult.createRegisterResult(register, type);
				}
			}

			symbolTable.incrementCalloffset(-paramOffset);

			// if(fun.isFunction())

			// if()

		}

		return returnValue;
	}
}
