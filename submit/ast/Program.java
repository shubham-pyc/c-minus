/*
 * Code formatter project
 * CS 4481
 */
package submit.ast;

import submit.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edwajohn
 */
public class Program implements Node {

  private ArrayList<Declaration> declarations;

  public Program(List<Declaration> declarations) {
    this.declarations = new ArrayList<>(declarations);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    toCminus(builder, "");
    return builder.toString();
  }

  @Override
  public void toCminus(StringBuilder builder, String prefix) {
    for (Declaration declaration : declarations) {
      declaration.toCminus(builder, "");
    }
  }

  public MIPSResult toMIPS(StringBuilder code, StringBuilder data, SymbolTable symbolTable,
      RegisterAllocator regAllocator) {

    data.append("newline: .asciiz	\"\\n\"\n");

    for (Declaration declaration : declarations) {
      if (declaration.getClass() == FunctionDeclaration.class) {

        declaration.toMIPS(code, data, symbolTable, new RegisterAllocator());
      } else {
        declaration.toMIPS(code, data, symbolTable, regAllocator);
      }
    }
    return null;
  }

}
