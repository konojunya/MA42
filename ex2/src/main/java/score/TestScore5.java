package score;

import score.TestScoreCon;

/**
 * MA42 Android用Java文法 Lesson2 Ex4
 * 
 * 学生の英数国理社の成績情報を表すクラス。
 * 
 * @author Shinzo SAITO
 */
public class TestScore5 extends TestScoreCon {
  /**
   * 理科の点数。
   */
  private int _science;
  /**
   * 社会の点数。
   */
  private int _social;

  /**
   * コンストラクタ。
   * 
   * @param name     名前。
   * @param english  英語の点数。
   * @param math     数学の点数。
   * @param japanese 国語の点数。
   */
  public TestScore5(String name, int english, int math, int japanese, int science, int social) {
    super(name, english, math, japanese);
    _science = science;
    _social = social;
  }

  /**
   * 合計点を表示するメソッド。
   */
  public void print() {
    super.print();
    int sum = _english + _math + _japanese + _science + _social;
    System.out.println(_name + "さんの5教科合計点: " + sum);
  }
}