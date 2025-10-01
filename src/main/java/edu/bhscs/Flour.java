package edu.bhscs;

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
