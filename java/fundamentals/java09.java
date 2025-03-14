public class java09 {
  public static void main(String[] args) {
    // varargs = allow a method to accept a varying number of arguments 
    //           makes methods more flexible, no need for overloaded meth
    //            java will packthe arguments into an array
    //             ... (ellipsis)
  
    System.out.println(average(2,2,2,2));
  }

  static double average( double... numbers){
    double sum =0;
    double avg;

    if( numbers.length == 0)
    {
      return 0;
    }
    for ( double num : numbers ){

      sum += num;
    }
    avg = sum/ numbers.length;
    return avg;
  }
  
}
