package model;

public class Bear  {
  private String name;
  private String color;
  private int weight;

  public Bear(){
    super();
  }

public Bear(String name, String color, int weight){
  super();
  this.name = name;
  this.color = color;
  this.weight = weight;

}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public String getColor() {
  return color;
}
public void setColor(String color) {
  this.color = color;
}
public int getWeight() {
  return weight;
}
//public void setAge(int age) {
//  this.age = age;
//}

public String speak() {
  return "Roarrr";
}



}
