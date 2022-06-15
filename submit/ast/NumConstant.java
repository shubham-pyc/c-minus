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
public class NumConstant implements Constant, Node {

  private final int value;

  public NumConstant(int value) {
    this.value = value;
  }

  public void toCminus(StringBuilder builder, final String prefix) {
    builder.append(Integer.toString(value));
  }

  public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
      RegisterAllocator regAllocator) {

    String reg = regAllocator.getAny();
    String formated = String.format("li %s, %d\n", reg, this.value);
    code.append(formated);
    return MIPSResult.createRegisterResult(reg, VarType.INT);
  }

}
