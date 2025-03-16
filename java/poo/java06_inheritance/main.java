

public class main {
  public static void main( String []  args) {
    // inheritance = one class inherits the attributes and methods 
    //               from another class
    //               child <- parent <- grandparent
    //                DRY
    Dog dog = new Dog();
    Cat cat = new Cat();
    Plant plant =new Plant();

    dog.eat();
    cat.eat();

    System.out.println(dog.isAlive);
    System.out.println(cat.isAlive);

    System.out.println(dog.lives);
    System.out.println(cat.lives);

    dog.speak();
    cat.speak();

    System.out.println(plant.isAlive);
    plant.photosynthesize();




  }
  
  
}
