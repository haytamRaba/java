

public class Friend {

  static int numberOfFriends;
  String name;
  Friend(String name){
    this.name =name;
    numberOfFriends++;
  }
  //static method
  static void showFriends(){
   // no need for the keyword this 
    System.out.println("you have " + numberOfFriends + " total friends");
  }
  
}
