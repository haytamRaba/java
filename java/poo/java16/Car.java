public class Car {

  String model;
  int year;
  Engine engine;

  Car(String model , int year , String engineType){
    this.model = model;
    this.year = year;
    this.engine = new Engine(engineType);

  }

  @Override
  public String toString(){
    return this.model + " " + this.year + " " + this.engine.type; 
  }

  void start(){
    this.engine.start();
    System.out.println("the " + this.model + " is running" );
  }
  
}
