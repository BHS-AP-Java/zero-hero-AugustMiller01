package edu.bhscs;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
  public int money = 0;
  String bakeryName = "Rolling in the Dough";
  public Flour myFlour;
  List<Cake> cakes = new ArrayList<>();

  public void AddCakeToMenu(Cake cake) {
    cakes.add(cake);
  }

  public void GetFlour() {
    myFlour = new Flour(3, 3, 5);
  }

  public void DisplayMenu() {
    System.out.println();
    System.out.println("MENU");

    for (Cake cake : cakes) {
      if (cake.ingredient != "null") {
        System.out.println(
            " " + cake.ingredient + " cake with " + cake.frosting + " frosting - $" + cake.price);

      } else {
        System.out.println(" (The hungry one ate this cake...) - $---");
      }
    }

    System.out.println();
  }

  public void SellCake(Cake cake, Awesome customer) {

    money += cake.price;
    customer.ownedCake = cake;
    System.out.println(
        customer.name
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

  public void SellCakeToPlayer(Cake cake, Player p) {

    String answer = p.giveAnswer("What cake do you want? (_____ with _____ frosting)");

    money += cake.price;

    System.out.println(
        "you bought the "
            + cake.ingredient
            + " cake with "
            + cake.frosting
            + " frosting for $"
            + cake.price);
  }
  public String GetName(){
    return bakeryName;
  }
}
