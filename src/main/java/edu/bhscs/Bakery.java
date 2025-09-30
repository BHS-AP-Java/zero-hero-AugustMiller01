package edu.bhscs;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
  public int money = 0;
  public Flour myFlour;
  List<String> cakes = new ArrayList<>();

  public void AddCakeToMenu(Cake cake) {
    cakes.add(cake.ingredient + " cake with " + cake.frosting + " frosting - $" + cake.price);
  }
  public void GetFlour(){
    myFlour = new Flour(3,3,5);

  }

  public void DisplayMenu() {
    System.out.println();
    System.out.println("MENU");

    for (String cake : cakes) {
      System.out.println(" " + cake);
    }

    System.out.println();
  }

  public void BuyCake(Cake cake, String name) {
    money += cake.price;
    System.out.println(
        name
            + " bought the "
            + cake.ingredient
            + " cake with "
            + cake.frosting
            + " frosting for $"
            + cake.price);
  }

  public void GetMoney() {
    System.out.println("Total money: $" + money);
  }
}
