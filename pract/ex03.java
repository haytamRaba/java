
// import java.util.Scanner;
public class ex03{
  public static void main(String [] args){

    // Scanner sc = new Scanner(System.in);

    // int[] tab = new int[5];
    // int i = 0;
    // while(i<5)
    // {
    //   System.out.printf("tab[%d] : ",i+1);
    //   tab[i] = sc.nextInt();
    //   i++;
    // }
  
    // i=0;
    // while(i < 5){
    //   System.out.println(tab[i]);
    //   i++;
    // }
   int[][] matrice = { {3,6,8,9} , {2,4} , {} , {8,9,0} };
    for(int i = 0 ; i <matrice.length; i++){
      System.out.printf("ligne %d :",i+1);
      for( int j =0 ; j<matrice[i].length;j++)
      {
        System.out.printf("  %d",matrice[i][j]);
      }
       System.out.print("\n");
    }

  }
}
