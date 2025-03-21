import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    
   // Exception = an event interrupts the normal flow of a program
   //             ( dividing by 0 , file not found , mismatch input type )
   //             surround any dangerous code with a try{ } block
   //             try{} , catch{} , finally{}

    
  //  System.out.println( 1 / 0 );

   try ( Scanner sc = new Scanner(System.in); ){ 

      System.out.print("enter a number : ");
      int number = sc.nextInt();
      System.out.println(number);

   }
  //  catch( InputMismatchException e){

  //   System.out.println("that wasnt a number");

  //  }
  //  catch( ArithmeticException e ){

  //   System.out.println("you cant divide by zero!");

  //  }
   catch( Exception e ){
    // safety net
    System.out.println("something went wrong");
   }
   finally{
    // this always execute
    // will close sc auto
    System.out.println("okay");
   }



  }
  
}
