package edu.bhscs;

public class Awesome {
  String name;
  String knowledge;
  int hunger;

  public Awesome(String name, int hunger) {

    this.name = name;
    this.hunger = hunger;
  }

  String getName() {
    int min = 1;
    int max = 100;
    int age = (int) (Math.random() * (max - min + 1)) + min;
    System.out.println("----------------------------------------------------");
    System.out.println();
    if (name == "steve") {
      return "Oh wait... "
          + name
          + "! Thats my name!"
          + " I am "
          + age
          + " years old."
          + meanRemark(age);

    } else if (name == "shed") {
      return "My name is Shed and I like chicken"
          + " I am "
          + age
          + " years old."
          + meanRemark(age);
    } else {
      return "My name is " + name + "." + " I am " + age + " years old." + meanRemark(age);
    }
  }

  String meanRemark(int age) {
    if (age <= 11) {
      return "(get back to kindergarden lil bro)";
    } else if (age <= 18) {
      return "(you probably have homework to do)";
    } else if (age <= 70) {
      return "(get back to work unc)";
    } else {
      return "(DAMN BRO GRO BACK TO THE NURSING HOME)";
    }
  }

  void learnSomething(String knowledge) {
    this.knowledge = knowledge;
  }

  String getKnowledge() {
    return this.knowledge;
  }
}
