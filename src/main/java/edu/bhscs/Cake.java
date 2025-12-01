package edu.bhscs;

// August Miller
// P2
// Bake Sale
// 9/10
// * having a baker work in a bakery, bake cakes, and have customers able to buy said cakes.
// *Then donate the money to the PTSA.

public class Cake {
  String ingredient;
  String frosting;
  int price;
  int weight;
  int quality;
  Flour flour;
  String name;
  int x;
  int y;
  boolean drawFlat = false;
  int stagger;
  int z;

  public Cake(String ingredient, Flour flour, int quality) {
    this.ingredient = ingredient;
    this.quality = quality;
    this.weight = 10;
    this.flour = flour;
    int min = 20;
    int max = 130;
    int i = (int) (Math.random() * (max - min + 1)) + min;
    this.price = i;
    this.name = ingredient + "cake.";
  }

  public void eatCake(int hunger, String name) {
    this.weight -= hunger;
    System.out.println(name + " ate " + hunger + " slices of the " + ingredient + " cake.");
  }

  public void getWeight() {
    System.out.println("the " + ingredient + " cake.");
  }

  public void SetFrosting(String frosting) {
    this.frosting = frosting;
  }

  public void DisplayQuality() {
    if (quality <= 1) {
      System.out.println("This is a terrible cake...");
      this.price -= 10;
    } else if (quality <= 2) {
      System.out.println("This is a fine cake.");

    } else if (quality <= 3) {
      System.out.println("This is a good cake!");
      this.price += 10;
    } else {
      System.out.println("Wow, This is a great cake!!!");
      this.price += 20;
    }
  }

  public void DrawCake(int x, int y, int z, int slope, int stagger, String frosting) {
    int transAxis = Math.min(z, y);
    int maxWidth = x + 2 * transAxis * slope; // Calculate total width based on x, slope, and layers

    // Draw top border
    DrawTopBorder(maxWidth, slope, transAxis + 1);

    // Draw cake layers
    int lastLeftSpace = (transAxis) * slope;
    int lastWidth = x + 2 * 0 * slope;

    for (int a = 0; a < transAxis; a++) {
      int leftSpace = lastLeftSpace;
      int currentWidth = lastWidth;
      if (a == 0 || a % stagger == 0) {

        leftSpace = (transAxis - a) * slope;
        currentWidth = x + 2 * a * slope;
        lastLeftSpace = leftSpace;
        lastWidth = currentWidth;
      } else {

      }

      // Adjust left indentation for each layer
      if (frosting.equals("no")) {
        PrintChars("|", leftSpace, " ", "|", currentWidth);

      } else {
        PrintChars("|", leftSpace, "-", "|", currentWidth);
      }
    }

    // Draw cake base
    int baseWidth = x + 2 * transAxis * slope;

    PrintChars("|", 0, "=", "|", baseWidth);
  }

  public void DrawCake(int x, int y, int z, int slope, int stagger, String frosting, Table table) {
    int transAxis = Math.min(z, y);
    int maxWidth = x + 2 * transAxis * slope; // Calculate total width based on x, slope, and layers
    // table width junk
    /*int spacing = ((table.width - (table.legs * table.legWidth)) / table.legs);
    int remainder = table.width % ((table.legWidth + spacing) * table.legs);
    table.width -= remainder + (spacing - table.legWidth) - (table.legWidth / 2);*/
    int indent = ((table.width - (x / 2)) / 2);

    // Draw top border
    if (x < table.width) {
      table.printIndent(indent, " ");
    }
    DrawTopBorder(maxWidth, slope, transAxis + 1);

    // Draw cake layers
    int lastLeftSpace = (transAxis) * slope;
    int lastWidth = x + 2 * 0 * slope;

    for (int a = 0; a < transAxis; a++) {
      int leftSpace = lastLeftSpace;
      int currentWidth = lastWidth;
      if (a == 0 || a % stagger == 0) {

        leftSpace = (transAxis - a) * slope;
        currentWidth = x + 2 * a * slope;
        lastLeftSpace = leftSpace;
        lastWidth = currentWidth;
      } else {

      }

      // Adjust left indentation for each layer
      if (frosting.equals("no")) {
        if (x < table.width) {
          table.printIndent(indent, " ");
        }
        PrintChars("|", leftSpace, " ", "|", currentWidth);

      } else {
        if (x < table.width) {
          table.printIndent(indent, " ");
        }
        PrintChars("|", leftSpace, "-", "|", currentWidth);
      }
    }

    // Draw cake base
    int baseWidth = x + 2 * transAxis * slope;
    if (x < table.width) {
      table.printIndent(indent, " ");
    }
    PrintChars("|", 0, "=", "|", baseWidth);
  }

  public void DrawTopBorder(int maxWidth, int slope, int transAxis) {

    // int topWidth = maxWidth - 2 * slope;
    int topWidth = maxWidth;
    for (int a = 0; a < transAxis; a++) {
      topWidth -= slope * 2;
    }
    int leftSpace = (transAxis) * slope;
    PrintChars("/", leftSpace, "^", "\\", topWidth);
  }

  public void PrintChars(String start, int amount, String content, String end, int lineLength) {
    StringBuilder temp = new StringBuilder();
    // Add left padding spaces
    for (int i = 0; i < amount; i++) {
      temp.append(" ");
    }
    // Add start character
    temp.append(start);
    // Add main content characters
    for (int i = 0; i < lineLength - 2; i++) { // -2 for start and end chars
      temp.append(content);
    }
    // Add end character
    temp.append(end);
    System.out.println(temp.toString());
  }

  void centeringMath(Table t) {
    int cakeWidth2 = this.x;
    int tableWidth = t.GetWidth();
    int offset = (this.x - tableWidth) / 2;
    int tableOffset = 0;
    int cakeOffset = 0;

    if (cakeWidth2 < tableWidth) {
      tableOffset = 0;
      cakeOffset = Math.abs(offset);
    } else {
      cakeOffset = 0;
      tableOffset = Math.abs(offset);
    }
  }

  public void Draw(Table t) {
    this.DrawCake(x, quality, z, price, stagger, frosting, t);
    t.DrawTable(20);
  }
}
