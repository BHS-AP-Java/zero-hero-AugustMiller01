package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  Player p;
  Flour f;
  Bakery placeOfWork;
  int cash;
  int skill;
  String name;

  // CONSTRUCTOR
  public Baker(Player p) {
    this.p = p;
  }

  public void learn(int amount){
    this.skill += amount;

  }
  // METHODS
  void takeOrder(int price, Awesome c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you you want?");
    learn(1);
    return new Cake(answer, this.f,this.skill);
  }

  void takeJob(Bakery bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.GetName()+"?");
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.GetName());
    }
  }

  public void FrostCake(Cake cake) {

    String answer = p.giveAnswer("Do you want frosting on your cake? (y/n)");

    if (answer.equals("y")) {
      String frost = p.giveAnswer("What kind of frosting do you want?");

      cake.SetFrosting(frost);

      ;

    } else if (answer.equals("n")) {
      System.out.println("Ok, unfrosted it is then.");
      cake.SetFrosting("no");
      ;
    } else {
      cake.SetFrosting("no");
      ;
    }

  }

  public void FinishUpCake(Cake cake,Bakery myBakery){
    myBakery.AddCakeToMenu(cake);
    System.out.println("you want a " + cake.ingredient + " cake with " + cake.frosting
        + " frosting? you got it!");
    cake.DisplayQuality();
  }
}
