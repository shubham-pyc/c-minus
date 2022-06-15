/*
 * Code formatter project
 * CS 4481
 */
package submit.ast;

/**
 *
 * @author edwajohn
 */
public enum BinaryOperatorType {

  OR("||"), AND("&&"),
  LE("<="), LT("<"), GT(">"), GE(">="), EQ("=="), NE("!="),
  PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/"), MOD("%");

  private final String value;

  private BinaryOperatorType(String value) {
    this.value = value;
  }

  public static BinaryOperatorType fromString(String s) {
    for (BinaryOperatorType at : BinaryOperatorType.values()) {
      if (at.value.equals(s)) {
        return at;
      }
    }
    throw new RuntimeException("Illegal string in OperatorType.fromString(): " + s);
  }

  @Override
  public String toString() {
    return value;
  }

}
