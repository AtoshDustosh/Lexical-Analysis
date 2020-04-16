package grammaAnalysis.symbol;

/**
 * A grammatical symbol, divided into finalizers and nonfinalizers, used for the left and right
 * parts of a production
 * 
 * @author lenovo
 *
 */
public class GrammaSymbol {
  protected int ifTerminal;// If the class is a terminator, subtract 1; The non-terminal deduction
                           // is 0

  public GrammaSymbol(int if_view) {
    ifTerminal = if_view;
  }

  /**
   * 
   * @return Variable types are either nonterminal or terminal
   */
  public int getType() {
    return ifTerminal;
  }


}
