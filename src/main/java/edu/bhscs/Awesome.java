package edu.bhscs;

public class Awesome {
  String name;

  public Awesome(String name) {
    System.out.println("I the most awesome " + name);
    this.name = name;
  }
  String getName(){
    if(name == "steve"){
      return "Oh wait... " + name + "! Thats my name!";
    } else if(name == "shed"){
      return "My name is Shed and I like chicken";
    }
    else{
      return "My name is "+name + ".";

    }


  }
}
