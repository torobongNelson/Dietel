package DS.OOP;

public class Animal {
  String name;
  String color;
  int size;

  public Animal(String name,String color,int size){
      this.name = name;
      this.color = color;
      this.size = size;
  }
  public void sleep(){
    System.out.println(this.name + " is sleeping now");
  }
  public  void eat(){
    System.out.println(this.name + " is eating now");
  }

  public void walk(){
    System.out.println(this.name + "is walking");
  }
  public void sound(){
    System.out.println(this.name + " is making a sound");
  }

}
