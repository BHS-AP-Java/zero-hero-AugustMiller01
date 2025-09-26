package edu.bhscs;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
  List<String> cakes = new ArrayList<>();

  public void AddCakeToMenu(Cake cake) {
    cakes.add(cake.ingredient + " cake with " + cake.frosting + " frosting - $" + cake.price);
  }

  public void DisplayMenu() {
    System.out.println();
    System.out.println("MENU");

    for (String cake : cakes) {
      System.out.println(" "+cake);
    }

    System.out.println();
  }
}
