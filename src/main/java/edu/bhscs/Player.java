package edu.bhscs;

// August Miller
// P2
// Bake Sale
// 10/8
// * having a baker work in a bakery, bake cakes, and have customers able to buy said cakes.
// *Then donate the money to the PTSA.

import java.util.Scanner;

public class Player {
  String name;
  Scanner scanner = new Scanner(System.in);
  int accomplishments;

  public Player(String name) {
    this.name = name;
    this.scanner = new Scanner(System.in);
  }

  public void answerQuestions() {
    System.out.println("what's your question?");
    String question = this.scanner.next();
    System.out.println(question + "? thats a stupid question.");
  }

  public String giveAnswer(String question) {
    System.out.println(question);
    return scanner.next();
  }

  public int giveNumber(String question) {
    System.out.println(question);
    String s = scanner.next();
    return (Integer.parseInt(s));
  }

  public void accomplish(int amount) {
    this.accomplishments += amount;
  }
}
