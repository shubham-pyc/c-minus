/*
 * Code formatter project
 * CS 4481
 */
package submit.ast;

import java.util.ArrayList;
import java.util.List;

import submit.*;

/**
 *
 * @author Shubham Gupta
 */
public class FunctionDeclaration implements Declaration, Node {

	private final VarType type;
	private final String id;
	private final List<String> paramIds;
	private final List<VarType> paramTypes;
	private final boolean isVoid;
	private Statement statement;
	private SymbolTable table;

	public FunctionDeclaration(VarType type, String id, List<String> paramIds, List<VarType> paramTypes, boolean isVoid,
			SymbolTable table) {
		this.type = type;
		this.id = id;
		// this.paras
		this.paramIds = paramIds;
		this.paramTypes = paramTypes;

		this.isVoid = isVoid;
		this.table = table;
		// this.statement = statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public void toCminus(StringBuilder builder, final String prefix) {
		builder.append(prefix);
		builder.append("\n");
		String returnType;
		if (this.isVoid) {
			returnType = "void";
		} else {
			returnType = type.toString();
		}
		builder.append(returnType).append(" ").append(this.id).append("(");

		for (int i = 0; i < this.paramIds.size(); i++) {
			String pId = paramIds.get(i);
			VarType pType = paramTypes.get(i);
			builder.append(pType).append(" ").append(pId).append(", ");
		}

		if (paramTypes.size() != 0) {

			builder.delete(builder.length() - 2, builder.length());
		}

		builder.append(")\n");
		this.statement.toCminus(builder, prefix);

		// for (int i = 0; i < ids.size(); ++i) {
		// final String id = ids.get(i);
		// final int arraySize = arraySizes.get(i);
		// if (arraySize >= 0) {
		// builder.append(id).append("[").append(arraySize).append("]").append(", ");
		// } else {
		// builder.append(id).append(", ");
		// }
		// }
		// builder.delete(builder.length() - 2, builder.length());
		// builder.append(";\n");
	}

	public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
			RegisterAllocator regAllocator) {

		code.append("\n\n\n\n" + this.id + ": \n");

		this.statement.toMIPS(code, data, this.table, regAllocator);

		// regAllocator.clearAll();

		if (this.id.equals("main")) {

			code.append("li $v0 10\nsyscall\n");

		} else {
			code.append("jr $ra\n");
		}
		regAllocator.clearAll();

		return null;
	}

}
