// August Miller
// P2

// Zero-Hero
// 9/12

/*
 * DESCRIPTION: Bakery bakes cakes that can be bought by customers
 * INPUT: we don't know about input yet
 * OUTPUT:Some cool words in the command line terminal thing
 * EDGE CASE:THey are all edge cases
 */

package edu.bhscs;

public class Main {

  public static void main(String[] args) {

    // padding
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
    Cake fourthCake = myBaker.BakeCake("vegan", "fruit", myBakery);
    Cake fifthCake = myBaker.BakeCake("Ice cream", "Chocolate", myBakery);
    // displays todays menu
    myBakery.DisplayMenu();

    // people buy cake
    myBakery.SellCake(firstCake, steve);
    myBakery.SellCake(secondCake, sue);

    System.out.println();

    // people eat cake
    secondCake.eatCake(sue.hunger, sue.name);
    firstCake.eatCake(steve.hunger, steve.name);

    // money donated to the PTSA
    System.out.println();
    System.out.println("Total Money: $" + myBakery.money);
    thePTSA.DontateToPTSA(myBakery.money);

  }
}
