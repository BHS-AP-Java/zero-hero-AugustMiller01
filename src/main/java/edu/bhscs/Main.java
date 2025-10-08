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
    myBaker.takeJob(myBakery);

    Cake cake1 = myBaker.bakeCake();
    myBaker.FrostCake(cake1);
    myBaker.FinishUpCake(cake1,myBakery);

    Cake cake2 = myBaker.bakeCake();
    myBaker.FrostCake(cake2);
    myBaker.FinishUpCake(cake2, myBakery);

    Cake cake3 = myBaker.bakeCake();
    myBaker.FrostCake(cake3);
    myBaker.FinishUpCake(cake3, myBakery);






    // Cakes get sold

    // money donated to the PTSA
    System.out.println();
    System.out.println("Total Money: $" + myBakery.money);
    thePTSA.DontateToPTSA(myBakery.money);
  }
}
