import java.util.Scanner;

public class weightConverter {
  public static void main(String[] args) {
    // weight conversion program
     Scanner sc = new Scanner(System.in);

     double weight;
     double newWeight;
     int choice;

     System.out.println("weight conversion program");
     System.out.println("1: convert lbs to kgs");
     System.out.println("2: convert kgs to lbs");
     System.out.print("choose (1 | 2 ) : ");
     choice = sc.nextInt();
     if(choice == 1 )
     {
      System.out.print("enter the weight in lbs : ");
      weight = sc.nextDouble();
      newWeight = weight * 0.453592;
      System.out.printf("the weight in kgs : %.2f" , newWeight);

     }
     else{
      System.out.print("enter the weight in kgs : ");
      weight = sc.nextDouble();
      newWeight = weight /0.453592;
      System.out.printf("the weight in lbs :%.2f "  newWeight);

     }







    sc.close();
  }
  
}

