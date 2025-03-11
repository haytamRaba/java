package fundamentals;
import java.util.Scanner;

public class java00{
  public static void main(String [] args){
   Scanner scanner = new Scanner(System.in);

    System.out.print("enter ur name : ");
    // get string
    String name = scanner.nextLine();

    System.out.print("enter ur age :");
    // get int
    int age = scanner.nextInt();

     scanner.nextLine();
    
     System.out.print("what is your gpa : ");
    // get float 
    double gpa = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("are you a student ? ");
    // get bool
    boolean isStudent = scanner.nextBoolean();


    System.out.println("hello " + name + " you are " + age + " your gpa is : " + gpa + " you are a "+ isStudent + " student");
    
    if(isStudent){
      System.out.println("you are enrolles as a student");
    }
    else{
      System.out.println("you are not enrolled");
    }



    scanner.close();
  } 
}   