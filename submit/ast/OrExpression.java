package submit.ast;

import java.util.List;
import java.util.ArrayList;

import submit.*;

public class OrExpression implements Expression {
	final private List<AndExpression> ands;

	public OrExpression(List<AndExpression> ands) {
		this.ands = ands;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		// builder.append(prefix);

		for (AndExpression v : this.ands) {
			v.toCminus(builder, prefix);
			builder.append(" || ");
		}
		builder.delete(builder.length() - 4, builder.length());
	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		if (this.ands.size() == 1) {
			return this.ands.get(0).toMIPS(code, data, symbolTable, regAllocator);

		} else {

			for (AndExpression v : this.ands) {
				v.toMIPS(code, data, symbolTable, regAllocator);
			}
		}

		return null;
	}
}
