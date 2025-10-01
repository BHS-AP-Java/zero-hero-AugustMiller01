package edu.bhscs;

public class PTSA {
  public int money;

  public PTSA() {}

  public void DontateToPTSA(int money) {

    this.money = money / 2;
    System.out.println("Money donated to PTSA: $" + money / 2);
  }
}
