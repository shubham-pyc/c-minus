package submit.ast;

import submit.*;

public class ExpressionStmt implements Statement {
	private final Expression expression;

	public ExpressionStmt(Expression expression) {
		this.expression = expression;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		builder.append(prefix);
		this.expression.toCminus(builder, prefix);
		builder.append(";\n");
	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable, RegisterAllocator regAllocator) {


		this.expression.toMIPS(code, data, symbolTable, regAllocator);
		return null;
	}
}
