import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // Runtime polymorphism = when the method that gets executed is decided at runtime
    //                        based on the actual type of object
    Scanner sc = new Scanner(System.in);

   Animal animal;
   int choice;

   System.out.print("would you like a dog or a cat ? (1: dog , 2: cat) :");
   choice = sc.nextInt();

    if( choice == 1 ){
      animal = new Dog();
      animal.speak();
    }
    else if( choice ==2) {
      animal = new Cat();
      animal.speak();
    }
    

    sc.close();


  }
  
}
