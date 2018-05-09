package score;

/**
 * MA42 Android用Java文法 Lesson2 Ex2
 * 
 * 学生の英数国の成績情報を表すクラス。
 * 
 * @author Shinzo SAITO
 */
public class TestScore {
  /**
   * 名前。
   */
  private String _name;
  /**
   * 英語の点数。
   */
  private int _english;
  /**
   * 数学の点数。
   */
  private int _math;
  /**
   * 国語の点数。
   */
  private int _japanese;

  /**
   * フィールドにデータを格納するメソッド。
   * 
   * @param name     名前。
   * @param english  英語の点数。
   * @param math     数学の点数。
   * @param japanese 国語の点数。
   */
  public void setData(String name, int english, int math, int japanese) {
    _name = name;
    _english = english;
    _math = math;
    _japanese = japanese;
  }

  /**
   * フィールドにデータを格納するメソッド。
   * 
   * @param name 名前。
   */
  public void setData(String name) {
    setData(name, 0, 0, 0);
  }

  /**
   * 合計点を表示するメソッド。
   */
  public void print() {
    int sum = _english + _math + _japanese;
    System.out.println(_name + "さんの3教科合計点: " + sum);
  }
}