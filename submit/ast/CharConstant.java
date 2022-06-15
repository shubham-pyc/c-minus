/*
 * Code formatter project
 * CS 4481
 */
package submit.ast;

import submit.*;

/**
 *
 * @author edwajohn
 */
public class CharConstant implements Constant {

  private final char value;

  public CharConstant(char value) {
    this.value = value;
  }

  public void toCminus(StringBuilder builder, final String prefix) {
    builder.append("'").append(value).append("'");
  }

  public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
      RegisterAllocator regAllocator) {
    return null;
  }

}
