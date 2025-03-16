package java00;

public class java00{
  
  static int varClass=3;
  public static void main(String[] args) {
    // -method : a block of reusable code that is executed when called
    // -overloaded methods : methods that share the same name but different
    //                      parameters
    // -variable scope : where a variable can be accessed
    //                  local && class
    double varlocal=1;
    System.out.println( add(varlocal,2) + add(2,2,2) );  

  }
  static double add(double a, double b){
    return a + b;
  }
  static double add(double a, double b, double c){
    return a+b+c;
  }

}