/*
 * Code formatter project
 * CS 4481
 */
package submit;

import submit.ast.VarType;

/**
 *
 * @author edwajohn
 */
public class SymbolInfo {

  private final String id;
  // In the case of a function, type is the return type
  private final VarType type;
  private final boolean function;
  private boolean isWritten;
  private int offset;
  private int arraySize = -1;

  public SymbolInfo(String id, VarType type, boolean function) {
    this.id = id;
    this.type = type;
    this.function = function;
  }

  public SymbolInfo(String id, VarType type, boolean function, int offset) {
    this.id = id;
    this.type = type;
    this.function = function;
    this.offset = offset;
  }

  public SymbolInfo(String id, VarType type, boolean function, int offset, int arraySize) {
    this.id = id;
    this.type = type;
    this.function = function;
    this.offset = offset;
    this.arraySize = arraySize;
  }

  public String getId() {
    return id;
  }

  public boolean isFunction() {
    return function;
  }

  public boolean getIsWritten() {
    return this.isWritten;
  }

  public void didWrite() {
    this.isWritten = true;
  }

  @Override
  public String toString() {
    return "<" + id + ", " + type + '>';
  }

  public int getOffset() {
    return this.offset;
  }

  public VarType getType() {
    return this.type;
  }
  
  public int getArraySize(){
    return this.arraySize;
  }

}
