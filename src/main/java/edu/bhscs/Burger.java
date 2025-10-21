package edu.bhscs;

// August Miller
// P2
// Burger
// 10/10

// Drawing burgers in the teminal

public class Burger {
  String name;
  String doneness;
  int weight = 5;

  public Burger() {}

  public void GetEaten(int amountEaten) {
    weight -= amountEaten;
  }

  private static String BreadGuts(int width) {
    String guts = "   ";
    for (int i = 0; i < width; i++) {
      guts += "_";
    }
    return guts;
  }

  private static void BurgerGuts(int width, String cha) {}

  public void Draw() {
    for (int i = 0; i < 1; i++) {
      System.out.println(BreadGuts(19));
    }
  }
}
