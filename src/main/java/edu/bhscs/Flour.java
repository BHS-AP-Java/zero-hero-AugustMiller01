package edu.bhscs;

// August Miller
// P2
// Bake Sale
// 10/2
// * having a baker work in a bakery, bake cakes, and have customers able to buy said cakes.
// *Then donate the money to the PTSA.

public class Flour {
  int lbs;
  int price;
  int quality;

  public Flour(int price, int lbs, int quality) {
    this.price = price;
    this.lbs = lbs;
    this.quality = quality;
  }

  public void goesBad() {
    this.quality = 0;
  }
}
