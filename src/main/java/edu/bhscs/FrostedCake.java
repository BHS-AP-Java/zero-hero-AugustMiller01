package edu.bhscs;

// August Miller
// P2
// Bake Sale
// 10/9
// * having a baker work in a bakery, bake cakes, and have customers able to buy said cakes.
// *Then donate the money to the PTSA.
public class FrostedCake {
  String ingredient;
  String frosting;
  int price;
  int weight;
  Flour flour;
  String name;
  Player p;

  public FrostedCake(Cake cake, String frosting) {
    this.ingredient = cake.ingredient;
    this.frosting = cake.frosting;
  }

  public void eatCake(int hunger, String name) {
    this.weight -= hunger;
    System.out.println(
        name
            + " ate "
            + hunger
            + " slices of the "
            + ingredient
            + " cake with "
            + frosting
            + " frosting");
  }

  public void getWeight() {
    System.out.println(
        "the "
            + ingredient
            + " cake with "
            + frosting
            + " frosting has "
            + weight
            + " slices left");
  }
}
