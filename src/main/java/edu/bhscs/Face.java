package edu.bhscs;

public class Face implements Offsetable {
  public void draw(){
    System.out.println("^_^");
  }
  public void draw( Offsetable other){
    this.draw(null);

  }
  public int getWidth(){
    return 5;
  }

}
