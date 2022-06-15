package submit.ast;

import java.util.List;
import java.util.ArrayList;
import submit.*;

public class CompoundStatement implements Statement {

	private List<VarDeclaration> varDeclarations;
	private List<Statement> statements;
	private SymbolTable symbolTable;

	public CompoundStatement(List<VarDeclaration> varDeclarations, List<Statement> statements, SymbolTable table) {
		this.varDeclarations = varDeclarations;
		this.statements = statements;
		this.symbolTable = table;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		builder.append(prefix);
		builder.append("{\n");
		for (VarDeclaration v : this.varDeclarations) {
			v.toCminus(builder, prefix + "  ");
		}

		for (Statement v : this.statements) {
			v.toCminus(builder, prefix + "  ");
		}
		builder.append(prefix).append("}\n");
	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		// int baseOffset = symbolTable.getBaseOffset();
		int baseOffset = this.symbolTable.getScopeOffset();

		// if (symbolTable.merge == true) {
		// baseOffset = 0;
		// }

		code.append("addi $sp $sp ").append(baseOffset).append("\n");

		code.append("#Entering new scope \n");
		code.append("# Variables: \n");
		// code.append(symbolTable.toString());
		for (Statement v : this.statements) {
			MIPSResult res = v.toMIPS(code, data, this.symbolTable, regAllocator);
			if (res != null && res.isRegister()) {
				regAllocator.clear(res.getRegister());
			}
		}
		code.append("# Exiting scope\n");
		code.append("addi $sp $sp ").append(-baseOffset).append("\n");
		return MIPSResult.createVoidResult();
	}

}
