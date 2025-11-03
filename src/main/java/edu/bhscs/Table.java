package edu.bhscs;

public class Table {
  int legs;
  int width;

  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
  }

  public void DrawTable(int legs, int width, int legWidth) {

    int spacing = ((width - (legs * legWidth)) / legs);
    int remainder = width % (legWidth + spacing);
    width -= remainder;
    for (int i = 0; i < width; i++) {
      // Draw table Here

      System.out.print("=");
    }

    // each row
    for (int i = 0; i < 4; i++) {
      System.out.println("");

      // each collum
      for (int y = 0; y < legs; y++) {
        // spaces and legs
        System.out.print("||");

        for (int x = 0; x <= spacing; x++) {

          System.out.print(" ");
        }
      }
    }
  }

  public void DrawTable(int legs, int width, int legWidth, int cakeWidth) {

    int indent = (cakeWidth - (width / 2)) / 2;

    int spacing = ((width - (legs * legWidth)) / legs);
    int remainder = width % (legWidth + spacing);
    width -= remainder;
    if(width <= cakeWidth){
      printIndent(indent, " ");
    }

    for (int i = 0; i < width; i++) {
      // Draw table Here
      System.out.print("=");
    }


    // each row
    for (int i = 0; i < 4; i++) {

      System.out.println("");
      if (width <= cakeWidth) {
        printIndent(indent, " ");
      }

      // each collum
      for (int y = 0; y < legs; y++) {
        // spaces and legs
        System.out.print("||");

        for (int x = 0; x <= spacing; x++) {

          System.out.print(" ");
        }
      }
    }
  }

  public void printIndent(int amount, String str) {
    for (int i = 0; i < amount; i++) {
      System.out.print(str);
    }
  }
}
