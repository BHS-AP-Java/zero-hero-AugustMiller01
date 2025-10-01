package edu.bhscs;

public class Cake {
  String ingredient;
  String frosting;
  int price;
  int weight;
  Flour flour;
  String name;

  public Cake(String ingredient, String frosting, Flour flour) {
    this.ingredient = ingredient;
    this.frosting = frosting;
    this.weight = 10;
    this.flour = flour;
    int min = 1;
    int max = 130;
    int i = (int) (Math.random() * (max - min + 1)) + min;
    this.price = i;
    this.name = ingredient + "cake with " + frosting + " frosting.";
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
