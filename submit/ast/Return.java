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
public class Return implements Statement {

  private final Expression expr;

  public Return(Expression expr) {
    this.expr = expr;
  }

  @Override
  public void toCminus(StringBuilder builder, String prefix) {
    builder.append(prefix);
    if (expr == null) {
      builder.append("return;\n");
    } else {
      builder.append("return ");
      expr.toCminus(builder, prefix);
      builder.append(";\n");
    }
  }

  public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
      RegisterAllocator regAllocator) {

    MIPSResult res = this.expr.toMIPS(code, data, symbolTable, regAllocator);
    if (res.isAddress()) {
      res = regAllocator.writeLoadAddress(code, regAllocator, res);
    }
    if (res.getType() == VarType.INT) {

      int offset = symbolTable.returnOffset;
      code.append(String.format("sw %s %s($sp)\n", res.getRegister(), offset));
      code.append("jr $ra\n");
      regAllocator.clear(res.getRegister());
    } else {
      System.out.println("Return type of something other then int not implemented");
    }

    return MIPSResult.createVoidResult();
    // return null;
  }

}
