public class Main {
  public static void main(String[] args) {
    
    // composition = represents a "part-of" relationship objects
    //               for ecample , an engine is "part of" car
    //               allows complex objects to be constructed from smaller objects

    Car car = new Car("URUS",2025,"V8");


    System.out.println(car);

    car.engine.start();
    System.out.println("* * * * * * * * * * *");
    car.start();







  }
  
}
