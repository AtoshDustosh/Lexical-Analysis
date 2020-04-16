package grammaAnalysis.symbol;

import analyzer.Token;

/**
 * The terminal character, which corresponds to Token 1:1
 * 
 * @author lenovo
 *
 */
public class Terminal extends GrammaSymbol {

  Token tk;// 终结符蕴含的Token变量

  public Terminal(Token tk) {
    super(1);
    this.tk = tk;
  }

  /**
   * 
   * @return The Token corresponding to the terminal.
   */
  public Token getToken() {
    return tk;
  }

}
