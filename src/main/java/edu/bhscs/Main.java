package edu.bhscs;

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

    myBakery.GetFlour();

    // fat customers
    Awesome steve = new Awesome("steve", 2);
    Awesome sue = new Awesome("sue", 7);

    // Baker bakes
    myBaker.takeOrder(3, sue);
    Cake unfrostedCake = myBaker.bakeCake();
    FrostedCake frostedCake = myBaker.FrostCake(unfrostedCake);

    // Cakes get sold

    // money donated to the PTSA
    System.out.println();
    System.out.println("Total Money: $" + myBakery.money);
    thePTSA.DontateToPTSA(myBakery.money);
  }
}
