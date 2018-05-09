package animal;

import animal.Animal;

/**
 * MA42 Android用Java文法 Lesson2 Ex1
 * 
 * 実行クラス2。
 * 
 * @author Shinzo SAITO
 */
public class CallAnimals2 {
  public static void main(String[] args) {
    Animal[] pets = new Animal[3];
    pets[0] = new Cat();
    pets[0].setName("たま");
    pets[1] = new Pig();
    pets[1].setName("とんこ");
    pets[2] = new Dog();
    pets[2].setName("ポチ");

    for (Animal pet : pets) {
      String name = pet.getName();
      String call = pet.call();
      System.out.println(name + ": " + call);
    }
    // pets[1].eat();
    pets[1].speak();
  }
}