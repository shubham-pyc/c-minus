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
public class StringConstant implements Expression, Constant {

  private final String value;

  public StringConstant(String value) {
    this.value = value;
  }

  public void toCminus(StringBuilder builder, final String prefix) {
    builder.append("\"").append(value).append("\"");
  }

  public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
      RegisterAllocator regAllocator) {

    SymbolInfo c = symbolTable.find(value);

    if (c != null && c.getIsWritten() == false) {
      String output = String.format("%s: .asciiz %s\n", c.getId(), value);
      data.append(output);
      c.didWrite();

      return MIPSResult.createAddressResult(c.getId(), VarType.STRING);
    }

    return MIPSResult.createVoidResult();
  }

}
