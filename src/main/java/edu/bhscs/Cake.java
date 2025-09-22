package edu.bhscs;

public class Cake {
  public int weight;
  String flavor;
  String frosting;

  public Cake(String flavor, String frosting) {
    this.weight = 10;
    this.flavor = flavor;
    this.frosting = frosting;

    System.out.println();
    System.out.println("oooo yummy cake!");
    System.out.println("oh sweet its " + flavor + "!");
    if (frosting == "no") {
      System.out.println("Wait, " + frosting + " frosting?? Ew...");
    } else {
      System.out.println("With " + frosting + " frosting?? Awesome!");
    }
  }

  public void eatCake(int amountEaten, String name) {
    System.out.println();
    System.out.println(name + " ate " + amountEaten + " slices of cake");

    this.weight = this.weight - amountEaten;
  }

  public int getWeight() {

    System.out.println(
        "the "
            + flavor
            + " cake with "
            + frosting
            + " frosting has "
            + this.weight
            + " slices left.");

    return this.weight;
  }
}
