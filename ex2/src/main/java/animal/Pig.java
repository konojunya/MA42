package animal;

/**
 * MA42 Android用Java文法 Lesson2 Ex1
 * 
 * 豚を表すクラス。
 * 
 * @author Shinzo SAITO
 */
public class Pig extends Animal {
  @Override
  public String call() {
    return "ぶうぶう";
  }

  @Override
  public void speak() {
    super.speak();
    System.out.println("すばらしい！");
  }

  /**
   * 美味しいメソッド。
   */
  public void eat() {
    System.out.println("うまい！");
  }
}