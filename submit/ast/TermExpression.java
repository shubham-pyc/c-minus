package submit.ast;

import java.util.List;

import submit.*;

public class TermExpression implements Expression {

	final private List<Expression> exps;
	final private List<String> mulop;

	public TermExpression(List<Expression> exps, List<String> mulop) {
		this.exps = exps;
		this.mulop = mulop;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		if (exps.size() == 1) {
			this.exps.get(0).toCminus(builder, prefix);
		} else {
			for (int i = 0; i < mulop.size(); i++) {
				this.exps.get(i).toCminus(builder, prefix);
				String re = mulop.get(i);
				builder.append(" " + re + " ");
			}
			this.exps.get(this.exps.size() - 1).toCminus(builder, prefix);
		}

	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		if (exps.size() == 1) {
			return this.exps.get(0).toMIPS(code, data, symbolTable, regAllocator);
		} else {

			MIPSResult res = this.exps.get(0).toMIPS(code, data, symbolTable, regAllocator);

			if (res.isAddress()) {
				res = RegisterAllocator.writeLoadAddress(code, regAllocator, res);
			}

			for (int i = 1; i < exps.size(); ++i) {

				MIPSResult res1 = this.exps.get(i).toMIPS(code, data, symbolTable, regAllocator);

				if (res1.isAddress()) {
					res1 = RegisterAllocator.writeLoadAddress(code, regAllocator, res);
				}
				String operation = mulop.get(i - 1);
				String op = "";

				if (operation.equals("*")) {
					op = "mult";
				} else if (operation.equals("/")) {
					op = "div";
				} else {
					// Modulus
				}

				String append = String.format("%s %s %s\n", op, res.getRegister(), res1.getRegister());
				code.append(append);
				append = String.format("mflo %s\n", res.getRegister());
				code.append(append);

				// Clear the second register
				regAllocator.clear(res1.getRegister());

			}

			return res;
		}

	}

}
