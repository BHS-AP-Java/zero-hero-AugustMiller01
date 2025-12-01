package edu.bhscs;

public class Table implements Offsetable {
  int legs;
  int width;
  int legWidth;
  int legLength;

  public Table(int legs, int width, int legWidth, int legLength) {
    this.legs = legs;
    this.width = width;
    this.legLength = legLength;
    this.legWidth = legWidth;
  }

  public void DrawTable() {

    int spacing = ((width - (legs * legWidth)) / legs);
    int remainder = width % ((legWidth + spacing) * legs);
    width -= remainder + (spacing - legWidth) - (legWidth / 2);
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

  public void DrawTable(int cakeWidth) {

    int indent = ((cakeWidth - (width / 2)) / 2) - 1;

    int spacing = ((width - (legs * legWidth)) / legs);
    int remainder = width % ((legWidth + spacing) * legs);
    width -= remainder + (spacing - legWidth) - (legWidth / 2);
    if (width <= cakeWidth) {
      printIndent(indent, " ");
    }

    for (int i = 0; i < width; i++) {
      // Draw table Here
      System.out.print("=");
    }

    // each row
    for (int i = 0; i < legLength; i++) {

      System.out.println("");
      if (width <= cakeWidth) {
        printIndent(indent, " ");
      }

      // each collum
      for (int y = 0; y < legs; y++) {
        // spaces and legs

        for (int z = 0; z < legWidth; z++) {
          System.out.print("|");
        }

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

  public int GetWidth() {
    int spacing = ((width - (legs * legWidth)) / legs);
    int remainder = width % ((legWidth + spacing) * legs);
    width -= remainder + (spacing - legWidth) - (legWidth / 2);
    return width;
  }
}
