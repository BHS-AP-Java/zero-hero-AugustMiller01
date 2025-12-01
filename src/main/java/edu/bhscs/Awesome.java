package edu.bhscs;

// August Miller
// P2
// Bake Sale
// 9/30
// * having a baker work in a bakery, bake cakes, and have customers able to buy said cakes.
// *Then donate the money to the PTSA.

public class Awesome {
  String name;
  int hunger;
  Cake ownedCake;
  public int money;

  public Awesome(String name, int hunger) {

    this.name = name;
    this.hunger = hunger;
  }

  public int pay(int price) {
    money -= price;
    return price;
  }

  public void takeCake(Cake cake) {
    ownedCake = cake;
  }
}
