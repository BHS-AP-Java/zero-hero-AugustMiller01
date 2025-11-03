package edu.bhscs;

public class Cake2 {

  public void draw(String name, String age) {
    for (int y = 0; y < 5; y++) {
      for (int x = 0; x < 10; x++) {
        System.out.print("*");
        System.out.print("^");
        System.out.print("%");
      }
      System.out.println();
    }
  }
}
