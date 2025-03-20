

public class Library {

  String name;
  String location;
  Book[] books;

  Library(String name, String location, Book[] books){

    this.name = name;
    this.location = location;
    this.books = books;
  }
  
  void displayInfo(){

    System.out.println("the " + this.name + " location: " + this.location);
    System.out.println("books available : ");

    for(Book book : books){
      System.out.println(book.displayInfo());
    }


  }
}
