import java.util.Scanner;

public class java01{
 public static void main(String [] args) {

    Scanner sc =new Scanner(System.in);

    double width = 0;
    double height = 0;
    double area = 0 ;

    System.out.print("enter width :");
    width = sc.nextDouble();

    System.out.print("enter height : ");
    height =sc.nextDouble();

    area = width * height;

    System.out.println(" area  : " + area + "cm ");

  sc.close();
 }
}