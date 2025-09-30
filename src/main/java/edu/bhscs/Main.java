// August Miller
// P2

// Zero-Hero
// 9/12

/*
 * DESCRIPTION: Whatever Mr.Reiber says
 * INPUT: we don't know about input yet
 * OUTPUT:Some cool words inthe command line terminal thing
 * EDGE CASE:THey are all edge cases
 */

package edu.bhscs;

public class Main {

  public static void main(String[] args) {

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

    // create bakery and baker
    Bakery myBakery = new Bakery();
    Baker myBaker = new Baker();
    PTSA thePTSA = new PTSA();

    myBakery.GetFlour();

    // fat customers
    Awesome steve = new Awesome("steve", 2);
    Awesome sue = new Awesome("sue", 7);

    // Baker bakes
    Cake firstCake = myBaker.BakeCake("Chocolate", "vanilla", myBakery);
    Cake secondCake = myBaker.BakeCake("Red velvet", "no", myBakery);
    Cake thirdCake = myBaker.BakeCake("Vanilla", "cheap", myBakery);

    // displays todays menu
    myBakery.DisplayMenu();

    myBakery.BuyCake(firstCake, steve.name);
    myBakery.BuyCake(secondCake, sue.name);

    System.out.println();
    secondCake.eatCake(sue.hunger, sue.name);
    firstCake.eatCake(steve.hunger, steve.name);

    System.out.println();
    thePTSA.DontateToPTSA(myBakery.money);
  }
}
