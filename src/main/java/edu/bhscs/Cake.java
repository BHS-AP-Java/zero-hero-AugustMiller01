package edu.bhscs;

public class Cake {
  String ingredient;
  String frosting;
  int price;
  int weight;

  public Cake(String ingredient, String frosting) {
    this.ingredient = ingredient;
    this.frosting = frosting;
    this.weight = 10;
    int min = 1;
    int max = 130;
    int i = (int) (Math.random() * (max - min + 1)) + min;
    this.price = i;

  }

  public void eatCake(int hunger, String name) {
    System.out.println();
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
