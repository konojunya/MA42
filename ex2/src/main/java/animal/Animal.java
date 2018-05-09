package animal;

/**
 * MA42 Android用Java文法 Lesson2 Ex1
 * 
 * 動物を表すクラス。
 * 
 * @author Shinzo SAITO
 */
public class Animal {
  /**
   * その動物の愛称を表すフィールド。
   */
  private String _name;

  /**
   * 愛称フィールドのせったー。
   */
  public void setName(String name) {
    _name = name;
  }

  /**
   * 愛称フィールドのゲッター。
   */
  public String getName() {
    return _name;
  }

  /**
   * 鳴き声のメソッド。
   * 
   * @return 鳴き声。
   */
  public String call() {
    return "どんな鳴き声？";
  }

  /**
   * お話しするメソッド。意味不明。
   */
  public void speak() {
    System.out.println("いえい！");
  }
}