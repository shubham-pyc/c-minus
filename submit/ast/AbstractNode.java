package submit.ast;

import submit.MIPSResult;
import submit.SymbolTable;
import submit.RegisterAllocator;

public abstract class AbstractNode {

	MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable, RegisterAllocator regAllocator) {
		return null;
	}

}
