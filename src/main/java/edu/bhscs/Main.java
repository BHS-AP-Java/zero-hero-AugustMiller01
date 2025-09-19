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

    Awesome steve = new Awesome("steve");
    Awesome sue = new Awesome("sue");
    Awesome shed = new Awesome("shed");
    Awesome john = new Awesome("john");

    System.out.println(steve.getName());
    steve.learnSomething("head empty");
    System.out.println(steve.getKnowledge());
    System.out.println(sue.getName());
    System.out.println(shed.getName());
    System.out.println(john.getName());
  }

  public static String awesome(String food) {
    return "sweat" + food;
  }
}

//REF!!!! DO SOMETHING!!!!!!!!!