

public class main {
  public static void main(String[] args) {
    // abstract = used to define abstract classes and methods
    //           abstraction is the process of hiding implementation details 
    //           and showing only the essential features
    //           abstract classes cant be instantiated directly 
    //           can contain 'abstract' methods "which must be implemented"
    //           can contain 'concrete' methos "which are inherited"

    // we cant create Shape s = new Shape();

    Circle circle = new Circle(3);
    Triangle triangle = new Triangle(4,2); 
    Rectangle rectangle = new Rectangle(6,7);

    circle.display();
    triangle.display();
    rectangle.display();

    System.out.println("circle area : "+circle.area());
    System.out.println("rectanglarea : "+rectangle.area());
    System.out.println("triangle area : "+triangle.area());




  }
  
}
