package edu.bhscs;

public class Cake {
  String ingredient;
  String frosting;
  int weight;
  public Cake(String ingredient,String frosting){
    this.ingredient = ingredient;
    this.frosting = frosting;
    this.weight = 10;
    System.out.println("ooo a "+ ingredient + " cake with " + frosting + " frosting!");


  }
  //do you work now??
  public void eatCake(int hunger, String name){
    System.out.println();
    this.weight -= hunger;
    System.out.println(name + " ate " + hunger + " slices of the " + ingredient + " cake with " + frosting + " frosting");


  }
  public void getWeight(){
    System.out.println("the " + ingredient + " cake with " + frosting + " frosting has "+ weight +" slices left;");
  }

}
