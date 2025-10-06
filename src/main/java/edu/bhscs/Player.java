package edu.bhscs;

import java.util.Scanner;

public class Player {
  String name;
  Scanner scanner = new Scanner(System.in);

  public Player(String name) {
    this.name = name;
    this.scanner = new Scanner(System.in);
  }

  public void answerQuestions() {
    System.out.println("what's your question?");
    String question = this.scanner.next();
    System.out.println(question + "? thats a stupid question.");
  }
}
