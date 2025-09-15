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

class Main {

  public static final char A = 'a';
  /*To make this project mine i tested out if I could create
  my own variable like A that would work the same way*/

  public static final char B = 'b';

  public static void main(String[] args) {
    int someNumber = 67;
    //test

    System.out.println("A's");
    System.out.println("------------------------------------");
    System.out.println();
    System.out.println("67!" + A + someNumber);
    System.out.println(A + "?" + A + someNumber);

    /*This is the most interesting like, as for all previous examples
    A functions as just a character, the letter a. But here,
    it can add itself with other numbers as long as there
    are no strings*/
    System.out.println(A + A + someNumber);
    System.out.println();

    System.out.println();

    System.out.println("B's");
    System.out.println("------------------------------------");
    System.out.println();
    System.out.println("67!" + B + someNumber);
    System.out.println(B + "?" + B + someNumber);
    //It looks like the "B" variable works the same way
    System.out.println(B + B + someNumber);
    System.out.println("this is neat");
    System.out.println("------------------------------------");
    System.out.println("");

    //A and B only function as numbers when being added to other numbers
    System.out.println(B + A);
    System.out.println(A);
    System.out.println(B);
    System.out.println("");



    System.out.println("Ok Im Done");

  }
}
