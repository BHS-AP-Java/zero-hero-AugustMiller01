package edu.bhscs;

import java.util.*;

public class App {

  public static void main(String[] args) {
    date_11_25();
  }

  public static void date_10_21() {
    Player user = new Player("me");

    new Cake2().draw("Me", "3");
  }

  public static void date_10_27() {
    Example e = new Example();
    e.Example1();
    Player p = new Player("Me");
    Baker bob = new Baker(p);
    Table t = new Table(3, 40, 3, 4);
    Cake cake = bob.bakeCake();
    bob.FrostCake(cake);
    int cakeX = 80;
    cake.DrawCake(cakeX, 5, 9, 1, 1, ")", t);

    t.DrawTable(cakeX);
  }

  public static void date_11_25() {
    Face face = new Face();
}
