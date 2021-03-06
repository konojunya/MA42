package practice;

import java.util.HashMap;
import java.util.Map;

/**
 * MA42 Android用Java文法 Lesson4 Ex4
 * 
 * Map+Entityを使った実行クラス。
 * 
 * @author Shinzo SAITO
 */
public class UseMapAndEntity {
  public static void main(String[] args) {
    Map<Integer, PersonalData> stock = new HashMap<>();

    PersonalData taro = new PersonalData(46887, "Tato", 72.8, 167.3, 23, 1);
    PersonalData jiro = new PersonalData(12457, "Jiro", 57.7, 170.4, 28, 1);
    PersonalData hanako = new PersonalData(63544, "Hanako", 53.1, 155.4, 19, 0);
    PersonalData keisuke = new PersonalData(34544, "Keisuke", 98.4, 192.4, 35, 1);

    stock.put(46887, taro);
    stock.put(12457, jiro);
    stock.put(63544, hanako);
    stock.put(34544, keisuke);

    System.out.println("要素は" + stock.size() + "コです。");

    System.out.println("---------- 中身を見てみよう。 ----------");
    for(Map.Entry<Integer, PersonalData> element : stock.entrySet()) {
      Integer key = element.getKey();
      PersonalData person = element.getValue();

      StringBuffer sbCurry = new StringBuffer();
      sbCurry.append("会員番号 ");
      sbCurry.append(key);
      sbCurry.append(" の人: ");
      sbCurry.append("名前=");
      sbCurry.append(person.getName());
      sbCurry.append("; ");
      sbCurry.append("身長=");
      sbCurry.append(person.getHeight());
      sbCurry.append("cm; ");
      sbCurry.append("体重=");
      sbCurry.append(person.getWeight());
      sbCurry.append("kg ");
      System.out.println(sbCurry.toString());
    }
  }
}