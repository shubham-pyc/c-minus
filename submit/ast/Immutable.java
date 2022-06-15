package submit.ast;

import submit.*;

public class Immutable implements Expression {

	final private Expression expression;
	final private Call call;
	final private Constant constant;

	public Immutable(Expression expression, Call call, Constant constant) {
		this.expression = expression;
		this.call = call;
		this.constant = constant;
	}

	@Override
	public void toCminus(StringBuilder builder, String prefix) {
		// TODO Auto-generated method stub
		// builder.append(prefix);

		if (this.expression != null) {
			builder.append("(");
			expression.toCminus(builder, prefix);
			builder.append(")");
		} else if (this.call != null) {
			call.toCminus(builder, prefix);
		} else if (this.constant != null) {
			constant.toCminus(builder, prefix);
		}

	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		if (this.expression != null) {
			return this.expression.toMIPS(code, data, symbolTable, regAllocator);
			// builder.append("(");
			// expression.toCminus(builder, prefix);
			// builder.append(")");
		} else if (this.call != null) {
			return call.toMIPS(code, data, symbolTable, regAllocator);
		} else if (this.constant != null) {
			return constant.toMIPS(code, data, symbolTable, regAllocator);
		}

		return MIPSResult.createVoidResult();
	}

}
