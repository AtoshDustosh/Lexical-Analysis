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

}
