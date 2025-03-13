import java.util.Arrays;
public class java07{
  public static void main(String[] args) {
    // array : a collection of values of the same data types

    String [] fruits={"orange","apple","banana","coconut"}; //array of strigns

    for(int i=0;i<fruits.length ; i++){

       System.out.println(fruits[i]);

      }
      Arrays.sort(fruits);
      for ( String fruit : fruits){
        System.out.print(fruit + " ");
      }
      Arrays.fill(fruits,"fill:pineapple");
      System.out.println();
      int i =0;
      while( i < fruits.length ){
        System.out.printf("[ %s ] ",fruits[i]);
        i++;
      }

    
  
  }

}