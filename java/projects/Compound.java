import java.util.Scanner;
class Compound{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    double princAmount;
    double rate;
    int timesCompound;
    int years;
    double finalAmount;

    System.out.print("enter the principal amount : ");
    princAmount = scan.nextDouble();

    System.out.print("enter the interest rate ( in perc % ): ");
    // to convert in %
    rate= scan.nextDouble() / 100;

    System.out.print("enter the # of times compounded per year : ");
    timesCompound= scan.nextInt();

    System.out.print("enter the # of years : ");
    years= scan.nextInt();

    finalAmount = princAmount * Math.pow(1 + rate / timesCompound , timesCompound * years);

    System.out.printf("the amount after %d years is : %.2f dh ",years,finalAmount);

    scan.close();
  }
}