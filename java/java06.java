import java.util.Scanner;
public class java06 {
  public static void main(String [] args){ 
    Scanner sc = new Scanner(System.in);

    int rows;
    int columns;
    String carc;

    System.out.print("enter the # of rows: ");
    rows = sc.nextInt();
    
    System.out.print("enter the # of columns: ");
    columns = sc.nextInt();
    sc.nextLine();

    System.out.print("enter the symbole to use : ");
    carc = sc.nextLine();

    for(int i=0 ; i < rows ; i++){
      for(int j=0; j <columns ;j++){
        System.out.print(carc + " \t");
      }
      System.out.println();
    }

   sc.close();
  }
}
