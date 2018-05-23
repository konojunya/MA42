package array;

import java.util.ArrayList;

/**
 * MA42 Android用Java文法 Lesson4 Ex1
 * 
 * ArrayListを使ったサンプル。
 * 
 * @author Shinzo SAITO
 */
public class UseArrayList {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Taro");
    names.add("Jiro");
    names.add("Hanako");
    names.add("Keisuke");
    System.out.println("例外は発生しません。");
  }
}