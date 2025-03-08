//math
import java.util.Scanner;

class java03{
  public static void main(String [] args){

    // System.out.println(Math.PI);
    // System.out.println(Math.E);

        // // puissance 
    // System.out.println("2 ** 5 = " +  Math.pow(2,5)  );
       // // valeur absolu 
    // System.out.println(" | -5 | = " + Math.abs( -5 ) );
       // // sqrt 
    // System.out.println(" sqrt( 9 ) = " + Math.sqrt( 9 ) );
       // // round : nearst integer 
    // System.out.println("round( 3.9 ) = " + Math.round(3.9) );
        // // round up
    // System.out.println("ceil( 2.01 ) = " + Math.ceil(2.01) );
       // // round down
    // System.out.println("floor( 2.99 ) = " + Math.floor(2.99) );
       // // max  and min
    // System.out.println(" max( 10 , 30 ) : " + Math.max(10,30) + " {***} min( 10 , 30 ) : " + Math.min(10,30));

    // calcul hypotenieus c = Math.sqrt(a^2 + b^2)
    Scanner scan = new Scanner(System.in);
    double a;
    double b;

    System.out.print(" enter a : " );
    a = scan.nextDouble();
    System.out.print(" enter b : " );
    b = scan.nextDouble();

    double hypotenieus;

    hypotenieus = Math.sqrt (Math.pow(a, 2) + Math.pow(b,2));
    System.out.println(" hypotenius = sqrt ( a**2 + b**2 ) ==> : " + hypotenieus + " cm.");




    scan.close();
  }
}