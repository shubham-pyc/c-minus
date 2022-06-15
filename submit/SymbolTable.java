package submit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import submit.ast.VarType;

/*
 * Code formatter project
 * CS 4481
 */
/**
 *
 */
public class SymbolTable {

  private final HashMap<String, SymbolInfo> table;
  private SymbolTable parent;
  private final List<SymbolTable> children;
  private int baseOffset = 0;
  private int scopeOffset = 0;
  private int calloffset = 0;
  public boolean merge = false;
  public static int datLabelCounter = 0;
  public int returnOffset = 0;

  public static String getDataLabel() {
    return "datalabel" + datLabelCounter++;
  }
  // private int offset;

  public int getOffset() {
    baseOffset -= 4;
    return baseOffset;
  }

  public int getArrayOffset(int size) {
    baseOffset -= size * 4;
    return baseOffset;
  }

  public int getBaseOffset() {
    return baseOffset + calloffset;
  }

  public int getBaseOffsetWithoutCallOffset() {
    return baseOffset;
  }

  public int getScopeOffset() {
    return scopeOffset;
  }

  public void setCallOffset(int offset) {
    this.calloffset = offset;
  }

  public void incrementCalloffset(int increment) {
    this.calloffset += increment;
  }

  public void setBaseOffset(int offset) {
    this.baseOffset = offset;
  }

  public SymbolTable() {
    table = new HashMap<>();
    parent = null;
    children = new ArrayList<>();
    this.addSymbol("println", new SymbolInfo("println", null, true));
    // mergeParent();
  }

  public SymbolTable(int scopeOffset) {
    // SymbolTable();
    table = new HashMap<>();
    parent = null;
    children = new ArrayList<>();
    this.addSymbol("println", new SymbolInfo("println", null, true));
    this.scopeOffset = scopeOffset;
    // mergeParent();
  }

  public SymbolTable(int scopeOffset, boolean merge) {
    // SymbolTable();
    table = new HashMap<>();
    parent = null;
    children = new ArrayList<>();
    this.addSymbol("println", new SymbolInfo("println", null, true));
    this.scopeOffset = scopeOffset;
    this.merge = true;
    // mergeParent();
  }

  public void removeChild(SymbolTable table) {
    this.children.remove(table);
  }

  private void mergeParent() {
    SymbolTable parent = this.parent;
    if (parent != null && parent.merge == true) {
      SymbolTable gradparent = parent.parent;
      if (gradparent != null) {

        // System.out.println("checking parent: " + parent);
        // System.out.println("checking grand parent: " + gradparent);
        // gradparent.removeChild(parent);
        // gradparent.children.add(this);
        // this.parent = gradparent;
        this.scopeOffset = 0;
        this.returnOffset = parent.returnOffset;
        for (String key : parent.table.keySet()) {
          SymbolInfo info = parent.table.get(key);
          if (info != null && info.getType() == VarType.INT) {
            this.getOffset();
          }
          table.put(key, info);
        }

      }
    }
  }

  public void addSymbol(String id, SymbolInfo symbol) {
    table.put(id, symbol);
  }

  public String toString() {
    String ret_value = "";

    for (String key : table.keySet()) {
      ret_value += "# " + key + "\n";
    }

    return ret_value;

  }

  /**
   * Returns null if no symbol with that id is in this symbol table or an ancestor
   * table.
   *
   * @param id
   * @return
   */
  public SymbolInfo find(String id) {
    if (table.containsKey(id)) {
      return table.get(id);
    }
    if (parent != null) {
      return parent.find(id);
    }
    return null;
  }

  public int findOffset(String id) {

    if (table.containsKey(id)) {
      return table.get(id).getOffset();
    }
    if (parent != null) {
      return parent.findOffset(id) - scopeOffset;
    }

    return -999;
  }

  /**
   * Returns the new child.
   *
   * @return
   */
  public SymbolTable createChild() {

    int offset = baseOffset;
    SymbolTable child = new SymbolTable(offset);
    children.add(child);
    child.parent = this;
    child.mergeParent();
    // if(this.merge = true){
    // child.setBaseOffset(this.baseOffset);
    // }

    return child;
  }

  public SymbolTable createChild(Boolean merge) {
    // Call this constructor when parent want's to merge with the child
    // int offset = baseOffset;
    // if (sameOffset) {
    // offset = 0;
    // }
    SymbolTable child = new SymbolTable(baseOffset, merge);
    children.add(child);
    child.parent = this;
    return child;
  }

  public SymbolTable getParent() {
    return parent;
  }

}
