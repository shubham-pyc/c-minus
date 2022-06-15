package submit.ast;

import submit.*;

public class WhileStmt implements Statement {
	private Expression e;
	private Statement s;

	public WhileStmt(Expression e, Statement s) {
		this.e = e;
		this.s = s;
	}

	@Override
	public void toCminus(StringBuilder builder, String prefix) {
		builder.append(prefix);
		builder.append("while (");
		this.e.toCminus(builder, prefix);
		builder.append(")\n");
		String sPrefix = prefix;
		if (!(this.s instanceof CompoundStatement)) {
			sPrefix += " ";
		}

		this.s.toCminus(builder, sPrefix);
		// TODO Auto-generated method stub

	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {
		String first = SymbolTable.getDataLabel();
		String second = SymbolTable.getDataLabel();

		code.append(first + ":\n");
		MIPSResult exp = this.e.toMIPS(code, data, symbolTable, regAllocator);
		code.append(String.format("bne %s $zero %s\n", exp.getRegister(), second));
		regAllocator.clear(exp.getRegister());
		this.s.toMIPS(code, data, symbolTable, regAllocator);
		code.append("j " + first + "\n");
		code.append(second + ":\n");

		return MIPSResult.createVoidResult();

	}
}
