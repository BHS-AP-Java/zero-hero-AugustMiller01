package edu.bhscs;

public class App {

  public static void main(String[] args) {
    date_10_27();
  }

  public static void date_10_21() {
    Player user = new Player("me");

    new Cake2().draw("Me", "3");
  }

  public static void date_10_27() {
    Player p = new Player("Me");
    Baker bob = new Baker(p);
    Table t = new Table(3, 15);
    Cake cake = bob.bakeCake();
    bob.FrostCake(cake);
    cake.DrawCake(9, 5, 9, 1, 1, ")");
    cake.DrawTable(4, 21,2);
  }
}
