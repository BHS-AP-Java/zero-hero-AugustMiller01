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

    // fat customers
    Awesome steve = new Awesome("steve", 2);
    Awesome sue = new Awesome("sue", 7);

    // Baker earning his keep
    Cake firstCake = myBaker.BakeCake("Chocolate", "vanilla", myBakery);
    Cake secondCake = myBaker.BakeCake("Red velvet", "no", myBakery);
    Cake thirdCake = myBaker.BakeCake("Vanilla", "cheap", myBakery);

    // pretty self explanitory
    myBakery.DisplayMenu();

    // poor cakes...
    firstCake.eatCake(steve.hunger, steve.name);
    firstCake.getWeight();

    secondCake.eatCake(sue.hunger, sue.name);
    secondCake.getWeight();
  }
}
