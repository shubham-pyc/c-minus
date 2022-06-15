package submit.ast;

import java.util.List;
import submit.*;

public class RealExpression implements Expression {
	final private List<SumExpression> sums;
	final private List<String> relop;

	public RealExpression(List<SumExpression> sums, List<String> relop) {
		this.sums = sums;
		this.relop = relop;

	}

	public void toCminus(StringBuilder builder, final String prefix) {
		// builder.append(prefix);
		if (sums.size() == 1) {
			this.sums.get(0).toCminus(builder, prefix);
		} else {
			for (int i = 0; i < relop.size(); i++) {
				this.sums.get(i).toCminus(builder, prefix);
				String re = relop.get(i);
				builder.append(" " + re + " ");
			}
			this.sums.get(this.sums.size() - 1).toCminus(builder, prefix);
		}

	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		if (sums.size() == 1) {
			return this.sums.get(0).toMIPS(code, data, symbolTable, regAllocator);
		} else {
			MIPSResult res = this.sums.get(0).toMIPS(code, data, symbolTable, regAllocator);

			if (res.isAddress()) {
				res = RegisterAllocator.writeLoadAddress(code, regAllocator, res);
			}

			for (int i = 1; i <= relop.size(); i++) {

				MIPSResult res1 = this.sums.get(i).toMIPS(code, data, symbolTable, regAllocator);
				Boolean subtract = false;

				if (res1.isAddress()) {
					res1 = RegisterAllocator.writeLoadAddress(code, regAllocator, res1);
				}
				String operation = relop.get(i - 1);
				String op = "";
				String first = "";
				String second = "";

				if (operation.equals(">")) {
					op = "slt";
					subtract = true;
					first = res1.getRegister();
					second = res.getRegister();
				} else if (operation.equals("<")) {
					op = "slt";
					subtract = true;
					first = res.getRegister();
					second = res1.getRegister();
				} else if (operation.equals("<=")) {
					op = "slt";
					// subtract = true;
					first = res.getRegister();
					second = res1.getRegister();
				} else if (operation.equals(">=")) {
					op = "slt";
					first = res.getRegister();
					second = res1.getRegister();
				} else if (operation.equals("==")) {
					op = "sub";
					first = res.getRegister();
					second = res1.getRegister();
				} else {
					System.out.println("Not implemented");
				}

				String append = String.format("%s %s %s %s\n", op, res.getRegister(), first, second);
				code.append(append);

				// Clear the second register
				regAllocator.clear(res1.getRegister());
				if (subtract) {
					code.append(String.format("subi %s %s 1\n", res.getRegister(), res.getRegister()));
				}
			}
			return res;
			// for (int i = 0; i < relop.size(); i++) {
			// this.sums.get(i).toCminus(builder, prefix);
			// String re = relop.get(i);
			// builder.append(" " + re + " ");
			// }
			// this.sums.get(this.sums.size() - 1).toCminus(builder, prefix);
		}
	}

}
