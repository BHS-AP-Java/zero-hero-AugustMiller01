package edu.bhscs;

public class Cake {
  String ingredient;
  String frosting;
  int price;
  int weight;
  Flour flour;
  String name;

  public Cake(String ingredient, Flour flour) {
    this.ingredient = ingredient;

    this.weight = 10;
    this.flour = flour;
    int min = 1;
    int max = 130;
    int i = (int) (Math.random() * (max - min + 1)) + min;
    this.price = i;
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
