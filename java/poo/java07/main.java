
public class main {
  public static void main(String[] args) {
    // super = refers to the parent class (subclass <- superclass)
    //        used in construcors and methods overriding
    //         calls the parent constructor to inialize attributes
    
    Person person = new Person("haytam","raba");
    person.showName();
    Student stdnt = new Student("haytam","raba",16);
    Employee employee = new Employee("Haytam", "Raba", 10000);

    person.showName();

    stdnt.showName();
    stdnt.shownote();

    employee.showsalary();
  }
  
}
