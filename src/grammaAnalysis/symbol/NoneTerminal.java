package grammaAnalysis.symbol;

/**
 * Non-terminal, which can be expanded by production
 * 
 * @author lenovo
 *
 */
public class NoneTerminal extends GrammaSymbol {
  String symbolString;

  public NoneTerminal(String sym) {
    super(0);
    symbolString = sym;
  }

  /**
   * 
   * @return The grammatical symbol of the non-terminal
   */
  public String getSymbol() {
    return symbolString;
  }

  /**
   * Determines whether the input non-terminator is the same as this one
   * 
   * @param anotherNonTerminal
   * @return true or false
   */
  public boolean ifSame(NoneTerminal anotherNonTerminal) {
    if (this.symbolString.contentEquals(anotherNonTerminal.symbolString)) {
      return true;
    }
    return false;
  }

}
