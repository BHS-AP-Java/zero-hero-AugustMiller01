package edu.bhscs;

// August Miller
// P2
// Bake Sale
// 10/8
// * having a baker work in a bakery, bake cakes, and have customers able to buy said cakes.
// *Then donate the money to the PTSA.

public class Main {
  public static void main(String[] args) {

    // padding

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    // create bakery, baker and ptsa.
    Bakery myBakery = new Bakery();

    PTSA thePTSA = new PTSA();
    Player p = new Player("August");
    Baker myBaker = new Baker(p);
    Cake[] cakesToBake = new Cake[3];
    Burger myBurger = new Burger();
    myBakery.GetFlour();

    myBaker.takeJob(myBakery);

    myBaker.BakeCakes(cakesToBake, myBakery);

    myBakery.DisplayMenu();

    // Cakes get sold

    // money donated to the PTSA
    // System.out.println();
    // System.out.println("Total Money: $" + myBakery.money);
    // thePTSA.DontateToPTSA(myBakery.money);
  }
}
