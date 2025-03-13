public class java08 {
  public static void main(String[] args) {
  // search an array

    int[] array = {1,4,5,7,8};
    int target =4;
    
    boolean isFound = false;

    for(int i =0 ; i< array.length ; i++){
      if(target == array[i]){
        System.out.printf("elem found at index : %d \n",i);
        isFound = true;
        break;
      }
    }

    System.out.print(isFound ? " " : "the element not found");
    
  }
  
}
