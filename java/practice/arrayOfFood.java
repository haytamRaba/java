import java.util.Scanner;

public class arrayOfFood {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] foods;
    int size;
    
    System.out.print("what number of food do u want : ");
    size = sc.nextInt();
    sc.nextLine();

    foods= new String[size];

    for(int i=0;i<foods.length;i++){
      System.out.print("enter food : ");
      foods[i]=sc.nextLine();
    }

    System.out.println("");

    for( String food : foods){
      System.out.println(food );
    }

    sc.close();
  }
  
}
