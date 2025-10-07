package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  Player p;
  Flour f;
  Bakery placeOfWork;
  int cash;

  // CONSTRUCTOR
  public Baker(Player p) {
    this.p = p;
  }

  // METHODS
  void takeOrder(int price, Awesome c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you you want?");
    return new Cake(answer, this.f);
  }

  void takeJob(Bakery bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }

  public FrostedCake FrostCake(Cake cake) {

    String answer = p.giveAnswer("Do you want frosting on your cake? (y/n)");
    if(answer == "y"){
      String frost = p.giveAnswer("What kind of frosting do you want?");
      return new FrostedCake(cake, frost);



    }else if(answer == "n"){
      System.out.println("Ok, unfrosted it is then.");
      return new FrostedCake(cake, "no");
    }else{
      return new FrostedCake(cake, "no");

    }


  }
}
