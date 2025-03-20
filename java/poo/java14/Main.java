

public class Main {
  public static void main(String[] args) {
    // they help protect object data and add rules for accessing or modifying them
    // getters : methods that make a fields readble
    // setters : methods that make a field writeable



    Car car = new Car("urus", "black", 13000);
    car.setColor("blue");
    car.setPrice(100);

    System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

  }
  
}
