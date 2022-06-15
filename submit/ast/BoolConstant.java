/*
 * Code formatter project
 * CS 4481
 */
package submit.ast;

/**
 *
 * @author edwajohn
 */
import submit.*;

public class BoolConstant implements Constant {

  private final boolean value;

  public BoolConstant(boolean value) {
    this.value = value;
  }

  public void toCminus(StringBuilder builder, final String prefix) {
    if (value) {
      builder.append("true");
    } else {
      builder.append("false");
    }
  }

  public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable, RegisterAllocator regAllocator) {
		return null;
	}

}
