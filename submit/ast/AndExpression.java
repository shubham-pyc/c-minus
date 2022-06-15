package submit.ast;

import submit.*;
import java.util.List;
import java.util.ArrayList;

public class AndExpression implements Expression {
	final private List<UnaryRealExpression> ureals;

	public AndExpression(List<UnaryRealExpression> ureals) {
		this.ureals = ureals;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		// builder.append(prefix);

		for (UnaryRealExpression v : this.ureals) {
			v.toCminus(builder, prefix);
			builder.append(" && ");
		}
		builder.delete(builder.length() - 4, builder.length());
	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		if (this.ureals.size() == 1) {
			return this.ureals.get(0).toMIPS(code, data, symbolTable, regAllocator);
		} else {

			for (UnaryRealExpression v : this.ureals) {
				v.toMIPS(code, data, symbolTable, regAllocator);
			}
		}

		return null;
	}
}
