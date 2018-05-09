package score;

/**
 * MA42 Android用Java文法 Lesson2 Ex2
 * 
 * 実行クラス。
 * 
 * @author Shinzo SAITO
 */
public class UseTestScore {
  public static void main(String[] args) {
    TestScore student = new TestScore();
    student.setData("太郎");
    student.print();
    student.setData("花子", 92, 78, 89);
    student.print();
  }
}