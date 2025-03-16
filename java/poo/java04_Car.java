public class java04_Car {
  
  String model;
  String color;

  java04_Car( String model, String color){
    this.model = model;
    this.color = color;
  }
  void drive(){
    System.out.println("you drive the " + this.model+ " " +this.color );
  }
}
