public class main {
  public static void main(String[] args) {

    // method overriding = when a subclass provides its own 
    //                     implementation of a method tht is already defined 
    //                     allows for code reusabiliy and give specifc implementations
   
    Dog dog = new Dog();
    dog.move();
    Fish fish = new Fish();
    fish.move();
  }
  
}
