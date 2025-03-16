

public class Student extends Person {
  double note;
  
  Student( String first,String last ,double note){
    // refred to the parent
    super(first , last);
    this.note = note;
  }
  void shownote(){
    System.out.println( this.first + " note is : " + this.note);
  }

  
}
