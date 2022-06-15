package submit.ast;

import java.lang.Thread.State;
import submit.*;

public class IfStmt implements Statement {
	private final Expression simpleExpression;
	private final Statement firstStatement;
	private final Statement secondExpression;

	public IfStmt(Expression simpleExpression, Statement firstStatement, Statement secondExpression) {
		this.simpleExpression = simpleExpression;
		this.firstStatement = firstStatement;
		this.secondExpression = secondExpression;

	}

	public void toCminus(StringBuilder builder, final String prefix) {
		builder.append(prefix);
		builder.append("if (");
		simpleExpression.toCminus(builder, prefix);
		builder.append(")\n");

		String firstPrefix = new String(prefix);

		if (!(firstStatement instanceof CompoundStatement)) {
			firstPrefix += " ";
		}

		firstStatement.toCminus(builder, firstPrefix);
		if (this.secondExpression != null) {
			String secPrefix = new String(prefix);
			if (!(this.secondExpression instanceof CompoundStatement)) {
				secPrefix += " ";
			}

			builder.append(prefix);
			builder.append("else\n");
			this.secondExpression.toCminus(builder, secPrefix);
		}

	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		String elseLabel = SymbolTable.getDataLabel();
		String restLabel = SymbolTable.getDataLabel();

		MIPSResult exp = simpleExpression.toMIPS(code, data, symbolTable, regAllocator);
		code.append(String.format("bne %s $zero %s\n", exp.getRegister(), elseLabel));
		regAllocator.clear(exp.getRegister());

		// This is IF statement
		MIPSResult res = firstStatement.toMIPS(code, data, symbolTable, regAllocator);

		if (res.isRegister() == true) {
			regAllocator.clear(res.getRegister());
		}

		code.append("j " + restLabel).append("\n");

		code.append(elseLabel + ":\n");
		if (secondExpression != null) {
			res = secondExpression.toMIPS(code, data, symbolTable, regAllocator);
			if (res.isRegister() == true) {
				regAllocator.clear(res.getRegister());
			}
		}
		code.append(restLabel + ":\n");

		return MIPSResult.createVoidResult();

	}

}
