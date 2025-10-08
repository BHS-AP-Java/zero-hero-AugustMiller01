package edu.bhscs;

public class Cake {
  String ingredient;
  String frosting;
  int price;
  int weight;
  int quality;
  Flour flour;
  String name;

  public Cake(String ingredient, Flour flour,int quality) {
    this.ingredient = ingredient;
    this.quality = quality;
    this.weight = 10;
    this.flour = flour;
    int min = 1;
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
  public void DisplayQuality(){
    if(quality <= 1){
      System.out.println("This is a terrible cake...");
    }else if(quality <= 2){
      System.out.println("This is a fine cake.");
    } else if (quality <= 3) {
      System.out.println("This is a good cake!");
    }else{
      System.out.println("Wow, This is a great cake!!!");
    }

  }
}
