package submit.ast;

import java.util.List;
import submit.*;

public class SumExpression implements Expression {

	final private List<TermExpression> exps;
	final private List<String> sumop;

	public SumExpression(List<TermExpression> exps, List<String> sumop) {
		this.exps = exps;
		this.sumop = sumop;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		if (exps.size() == 1) {
			this.exps.get(0).toCminus(builder, prefix);
		} else {
			for (int i = 0; i < sumop.size(); i++) {
				this.exps.get(i).toCminus(builder, prefix);
				String re = sumop.get(i);
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
					res1 = RegisterAllocator.writeLoadAddress(code, regAllocator, res1);
				}
				String operation = sumop.get(i - 1);
				String op = "";

				if (operation.equals("+")) {
					op = "add";
				} else if (operation.equals("-")) {
					op = "sub";
				} else {
					// Modulus
				}

				String append = String.format("%s %s %s %s\n", op, res.getRegister(), res.getRegister(),
						res1.getRegister());
				code.append(append);

				// Clear the second register
				regAllocator.clear(res1.getRegister());
			}
			return res;

		}

	}

}
