import java.util.Scanner;

public class java{

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

      String item;
      double price;
      int quantity;
    

      System.out.print("what item would u like to buy? : ");
      item = sc.nextLine();

      System.out.print("enter price: ");
      price = sc.nextDouble();

      System.out.print("enter quqntity: ");
      quantity = sc.nextInt();
      
      System.out.println("your product is : " + item);
      System.out.println("price is : " + price);
      System.out.println("quantity is : " + quantity);
      System.out.println("total is : "+ ( price* quantity)+" dh");
    
     sc.close();
  }

}
