

public class Main {
  public static void main(String[] args) {
    // Aggregation = represents a ' has-a ' relationship between objects
    //              one object contais another objects as part of its structue,
    //               but the contained object/s can exist independently

    Book book1 = new Book("Atomic Habits",400);
    Book book2 = new Book("The Clean Coder",500);
    Book book3 = new Book("The Two Towers",352);

    Book[] books = {book1,book2,book3};

    Library library = new Library("Librairie Maarif Culture","Ibnou Zarara" ,books);

    library.displayInfo();
    


  }
  
}
