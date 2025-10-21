package edu.bhscs;

// August Miller
// P2
// Bake Sale
// 9/28
// * having a baker work in a bakery, bake cakes, and have customers able to buy said cakes.
// *Then donate the money to the PTSA.

public class PTSA {
  public int money;

  public PTSA() {}

  public void DontateToPTSA(int money) {

    this.money = money / 2;
    System.out.println("Money donated to PTSA: $" + money / 2);
  }
}
