package submit.ast;


import submit.*;

public class BreakStmt implements Statement {
	@Override
	public void toCminus(StringBuilder builder, String prefix) {
		// TODO Auto-generated method stub
		builder.append(prefix);
		builder.append("break;\n");

	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable, RegisterAllocator regAllocator) {
		return null;
	}
}
