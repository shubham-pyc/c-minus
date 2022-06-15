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
public class Mutable implements Expression, Node {

  private final String id;
  private final Expression index;

  public Mutable(String id, Expression index) {
    this.id = id;
    this.index = index;
  }

  @Override
  public void toCminus(StringBuilder builder, String prefix) {
    builder.append(id);
    if (index != null) {
      builder.append("[");
      index.toCminus(builder, prefix);
      builder.append("]");
    }
  }

  public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
      RegisterAllocator regAllocator) {

    SymbolInfo s = symbolTable.find(this.id);

    if (s.getType() == VarType.INT) {
      String r = regAllocator.getAny();
      code.append(String.format("li %s %d\n", r, symbolTable.findOffset(this.id)));
      code.append(String.format("add %s %s $sp\n", r, r));
      if (s.getArraySize() == -99) {
        code.append(String.format("lw %s 0(%s)\n", r, r));
      }
      if (index != null) {
        MIPSResult res = this.index.toMIPS(code, data, symbolTable, regAllocator);
        if (res.isAddress() == true) {
          res = regAllocator.writeLoadAddress(code, regAllocator, res);
        }
        String mult = regAllocator.getAny();
        code.append(String.format("li %s %d\n", mult, 4));
        code.append(String.format("mul %s %s %s\n", res.getRegister(), res.getRegister(), mult));
        code.append(String.format("add %s %s %s\n", r, r, res.getRegister()));

        regAllocator.clear(mult);
        regAllocator.clear(res.getRegister());
      } else {
        SymbolInfo info = symbolTable.find(this.id);
        if (s.getArraySize() != -1) {
          // return null;
          return MIPSResult.createRegisterResult(r, VarType.INT);
        }
      }

      // return MIPSResult.createRegisterResult(r, s.getType());
      return MIPSResult.createAddressResult(r, s.getType());
    }

    // System.out.println("Checking offset " + s.getOffset());

    return null;

    // return null;
  }

  public int getIndex() {
    if (this.index == null) {
      return 0;
    } else {
      return 0;
    }
  }

}
