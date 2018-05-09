package score;

/**
 * MA42 Android用Java文法 Lesson2 Ex3
 * 
 * 実行クラス。
 * 
 * @author Shinzo SAITO
 */
public class UseTestScoreCon {
  public static void main(String[] args) {
    TestScoreCon student = new TestScoreCon("太郎");
    student.print();
    student = new TestScoreCon("花子", 92, 78, 89);
    student.print();
  }
}