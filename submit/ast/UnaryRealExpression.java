package submit.ast;

import java.util.List;

import submit.*;

public class UnaryRealExpression implements Expression {
	final private RealExpression reals;
	final private int bangs;

	public UnaryRealExpression(int bangs, RealExpression reals) {
		this.bangs = bangs;
		this.reals = reals;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		// builder.append(prefix);

		for (int i = 0; i < bangs; i++) {
			builder.append("!");
		}
		// builder.append(" ");

		// for (RealExpression i : this.reals) {
		this.reals.toCminus(builder, prefix);
	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		return this.reals.toMIPS(code, data, symbolTable, regAllocator);
	}
}
