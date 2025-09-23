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

  public static final float NAME_OF_THIS_FLOAT = 69.420f;
  public static final char A = 'a';

  public static void main(String[] args) {

    System.out.println(7);
    System.out.println(awesome("hamburger"));
    System.out.println();
    System.out.println();

    System.out.println();
    System.out.println();
    System.out.println();

    Baker myBaker = new Baker();

    Awesome steve = new Awesome("steve", 2);
    Awesome sue = new Awesome("sue", 7);

    Cake firstCake = myBaker.BakeCake("Chocolate", "vanilla");
    Cake secondCake = myBaker.BakeCake("Red velvet", "no");

    firstCake.eatCake(steve.hunger, steve.name);
    firstCake.getWeight();

    secondCake.eatCake(sue.hunger, sue.name);
    secondCake.getWeight();
  }

  public static String awesome(String food) {
    return "sweat" + food;
  }
}

// REF!!!! DO SOMETHING!!!!!!!!!
