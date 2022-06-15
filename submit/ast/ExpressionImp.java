package submit.ast;

import submit.*;

public class ExpressionImp implements Expression {
	final private Mutable mutable;
	final private String operator;
	final private Expression expression;

	public ExpressionImp(Mutable mutable, String operator, Expression expression) {
		this.mutable = mutable;
		this.operator = operator;
		this.expression = expression;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		mutable.toCminus(builder, prefix);

		// TODO: Exception for -- and ++ binary operators
		if (!operator.equals("--") && !operator.equals("++")) {
			builder.append(" ");
		}

		builder.append(operator);
		if (this.expression != null) {
			builder.append(" ");
			this.expression.toCminus(builder, prefix);
		}

	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		if (this.mutable == null) {

			return this.expression.toMIPS(code, data, symbolTable, regAllocator);
		} else {
			MIPSResult mutRes = this.mutable.toMIPS(code, data, symbolTable, regAllocator);
			MIPSResult expRes = this.expression.toMIPS(code, data, symbolTable, regAllocator);

			if (expRes.isAddress()) {
				expRes = RegisterAllocator.writeLoadAddress(code, regAllocator, expRes);
			}

			if (this.operator.equals("=")) {
				// TODO: For array this 0 in 0(%register) will be a varalbe value
				code.append(String.format("sw %s %d(%s)\n", expRes.getRegister(), 0, mutRes.getAddress()));
				regAllocator.clear(expRes.getRegister());
				regAllocator.clear(mutRes.getAddress());
				return MIPSResult.createVoidResult();
			}

			return mutRes;
			// return MIPSResult.createVoidResult();

		}

		// return null;
	}

}
