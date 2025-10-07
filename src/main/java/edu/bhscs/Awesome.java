package edu.bhscs;

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
