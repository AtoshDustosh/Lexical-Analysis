package analyzer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Pattern;

import data.args.WordTypes;
import data.input.InputFile;

/**
 * ���ݳ������̣���Ҫ��ĳ������������ʵ�����е���Щ���衣
 * ��Ҫ�Ƕ�ȡ���źͽ����Ӧ��DFA��֮�����DFA�Զ����Ľ���ж��Ƿ񽫵�ǰʶ��ĵ���¼��token��
 * �����ж�Ϊʶ�������˾���Ҫ��һ��Lexical Analyzer�࣬���������ܵ�ִ�п���ڲ���
 * ��Ҫ��һ����ȡ�ļ����ŵ�Scanner��һ�ε��ø�������DFA�Զ����Ĵ��룬
 * ���Ҳ����Ҫ���ڲ������������͵�DFA�����⣬��Ҫ���ܹ�����DFA���ؽ��¼��token�Ĺ��ܡ�
 * ���������Ҫʵ��ͼ�λ�����Ļ�������Ҫ�����е���������һ��ͼ�λ������main�������ظ�һ�飬 ����һ�����Ͳ�����Lexical
 * Analyzer���main������ʵ���������̣� ����Ҫ������һ��������ʵ�֡� This class can analyze a
 * program file of specific format and get all tokens of it.
 * 
 * @author AtoshDustosh
 */
public class LexicalAnalyzer {

  private final DfaAnalyzer charAnalyzer = new DfaAnalyzer(
      WordTypes.CHAR.getType(),
      InputFile.charDFA.getFilePath());
  private final DfaAnalyzer numAnalyzer = new DfaAnalyzer(
      WordTypes.NUM.getType(),
      InputFile.numDFA.getFilePath());
  private final DfaAnalyzer stringAnalyzer = new DfaAnalyzer(
      WordTypes.STRING.getType(),
      InputFile.stringDFA.getFilePath());
  private final DfaAnalyzer idnAnalyzer = new DfaAnalyzer(
      WordTypes.IDN.getType(),
      InputFile.idnDFA.getFilePath());
  private final DfaAnalyzer op_dl_comAnalyzer = new DfaAnalyzer(
      WordTypes.OP_DL_COM.getType(),
      InputFile.op_dl_comDFA.getFilePath());

  Queue<String> chQueue = new LinkedList<>();

  public LexicalAnalyzer() {

  }

  public Tokens analyzeFile(String filePath) {
    try {
      Scanner scanner = new Scanner(new FileInputStream(filePath));
      boolean hasNext = scanner.hasNext();
      while (hasNext) {
        String result = null;
        char[] lineChars = (scanner.nextLine() + "\n").toCharArray();
        for (int i = 0; i < lineChars.length; i++) {
          if (lineChars[i] == ' ' || lineChars[i] == '\t') {
            continue;
          }
          /*
           * analyze input char and process queue.
           */
        }
        /*
         * 
         */
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return null;
  }

  private String analyzeChar(char ch) {

    return null;
  }

  private boolean isNonnegativeInteger(String str) {
    Pattern pattern = Pattern.compile("^[\\+]?[\\d]+$");
    return pattern.matcher(str).matches();
  }

}
