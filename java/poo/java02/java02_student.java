package java02;
public class java02_student {
  String name;
  int age;
  double note;
  boolean isEnrolled;  

  java02_student( String name, int age, double note ){
    this.name = name;
    this.age = age;
    this.note = note;
    this.isEnrolled = true;
  }

  void study(){
    System.out.println(this.name + " is studying");
  }

}
