public class Main {
  public static void main ( String[] args){
    // Anonymous class = a class that doesnt have a name . cannot be reused .
    //                  add custom behavior without having to create a new class.
    //                  often used for one time uses(Timertask,Runnable,Callbacks)


    Dog dog1 = new Dog();
    Dog dog2 =new Dog(){
     @Override
     void speak(){
      System.out.println("scoby doo bi do");
     }

    };
    dog1.speak();
    dog2.speak();







  }
  
}
