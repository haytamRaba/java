
public class main {
    public static void main(String[] args) {
      // static = makes a variable or method belong to the class rather than to any 
      //         specific object.
      //         commonly used for utility methods or shared resources

      Friend friend = new Friend("spongeboob");

      System.out.println(Friend.numberOfFriends);

      Friend friend1 = new Friend("nizar");
      Friend friend2 = new Friend("patrick");
     

      System.out.println(Friend.numberOfFriends);
      // static method 
      Friend.showFriends();
      
    
  }
}
