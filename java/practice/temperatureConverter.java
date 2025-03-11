import java.util.Scanner;

public class temperatureConverter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double temp;
    double newTemp;
    String unit;

    System.out.print("Enter the temperature: ");
    temp = sc.nextDouble();

    System.out.print("Convert to Celisius or Farenheit ? ( C | F) : ");
    unit = sc.next().toLowerCase(); // one charcter
   
    newTemp =  unit.equals("c") ? (temp -32) * 5 / 9 :
               unit.equals("f") ? (temp * 5/9)+ 32 :
               0;

    System.out.printf(newTemp != 0 ? "new temp is :   "+ newTemp + " " + unit : "chose c or f");




    sc.close();
  }
  
}
