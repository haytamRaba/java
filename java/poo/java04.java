public class java04 {
  public static void main(String[] args) {
    java04_Car car = new java04_Car("mustang", "black");
    java04_Car car1 = new java04_Car("urus", "blue");
    java04_Car car2 = new java04_Car("amg", "gray");

    java04_Car [] cars = new java04_Car[3];
    cars[0] = car ;
    cars[1] = car1 ;
    cars[2] = car2;

    for( java04_Car c : cars){
       
      System.out.print(c.model + " " + c.color +"\n");
      c.drive();
      System.out.println();

    }
  }
  
}
