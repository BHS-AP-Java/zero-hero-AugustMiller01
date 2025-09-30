package edu.bhscs;

public class Baker {
  String name;
  Bakery myBakery;
  int skill;
  int experience = 0;
  public Baker() {
    int min = 1;
    int max = 5;
    int namei = (int) (Math.random() * (max - min + 1)) + min;
    if (namei == 1) {
      this.name = "John";

    } else if (namei == 2) {
      this.name = "Megatron";

    } else if (namei == 3) {
      this.name = "Gus";

    } else if (namei == 4) {
      this.name = "Jeff Bezos";

    } else if (namei == 5) {
      this.name = "Elon";
    }
    System.out.println("The Baker responsible for your cakes today will be " + name + ".");
  }

  public Cake BakeCake(String ingredient, String frosting, Bakery bakery) {

    Cake cake = new Cake(ingredient, frosting,bakery.myFlour);
    bakery.AddCakeToMenu(cake);
    experience ++;
    return cake;
  }
}
