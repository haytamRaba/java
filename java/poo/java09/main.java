
public class main {
  public static void main(String[] args) {

    // tostring() = method inhertited from th object class
    //             used to return a string represntation of an object 
    //             by default , it returns a shash code as a unique identifier
    //              it can be overridden to provide a meaningful details



    Car car = new Car("ford","mustang",2025,"red");
    Car car2 = new Car("cheverolet","corvette",2026,"blue");

    System.out.println(car);
    System.out.println(car2);
    
  }
  
}
