public class java01_Car {
  
  String make = "Ford";
  String model = "Mustang";
  double price = 58000.99;
  boolean isRunning = false;

  void start(){
    isRunning =true;
    System.out.println("you start the engine");
  }
  void stop(){
    isRunning = false;
    System.out.println("you stop the engine");
  }
  void drive(){
    System.out.println("you drive the " + model);
  }  
  void brake(){
    System.out.println("you brake the "+model);
  }
}
