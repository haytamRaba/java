import java.util.Random;
import java.util.Random;

class java02{

  public static void main(String [] args){
    Random ran = new Random();
// random nbr between 1 and 100
    int nb ;
    nb = ran.nextInt(100)+1;
    System.out.println("nbr est : "+ nb);
// thead or tail 
    boolean ishead;
    ishead = ran.nextBoolean();
   
    if (ishead){
      System.out.println("heads");
    }
    else{
      System.out.println("tail");
    }



  }


}