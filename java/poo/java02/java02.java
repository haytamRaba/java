package java02;
public class java02 {
  public static void main(String[] args) {
    // constructor = a special method to initialize objects
    //              you can pass arguments to a constructor
    //              and set up initial values
    // this  is a reference to the current object

    java02_student student = new java02_student("haytam",20, 15);
    System.out.println(student.name + " " + student.age + " " + student.note + " " + student.isEnrolled);
    student.study();








  }
  
}
