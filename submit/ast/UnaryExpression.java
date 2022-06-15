package submit.ast;

import java.util.List;
import submit.*;

public class UnaryExpression implements Expression {

	private final Expression factor;

	private final List<String> uaryop;

	public UnaryExpression(List<String> unaryop, Expression factor) {
		this.factor = factor;
		this.uaryop = unaryop;

	}

	public void toCminus(StringBuilder builder, final String prefix) {
		// builder.append(prefix);

		// TODO Test this to add space in the right
		for (String s : uaryop) {
			builder.append(s);
		}
		factor.toCminus(builder, prefix);
	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		// TODO Check this unary thing for toMips

		MIPSResult res = this.factor.toMIPS(code, data, symbolTable, regAllocator);

		if (uaryop.size() > 0) {

			if (res.isAddress()) {
				res = regAllocator.writeLoadAddress(code, regAllocator, res);
			}

			for (String op : uaryop) {
				if (op.equals("-")) {
					code.append(String.format("sub %s, $zero, %s\n", res.getRegister(), res.getRegister()));
				}

				// System.out.println("Checking: " + op);
			}
		}

		return res;
	}
}
