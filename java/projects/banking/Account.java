import java.time.LocalDate;

public class Account {

  static int id = 0;
  String name;
  int sold ;


  Account(String name, int sold){
    this.name = name;
    this.sold = sold;
    id++;
  }
  void send(Account ac,int amount){
    LocalDate date = LocalDate.now();

    if(this.sold < amount){
      System.out.println("you balance is empty!");
    }
    else{
      this.sold -= amount;
      ac.sold += amount;
      System.out.println("the operation is successfuly passed , from :" + this.name + " to :" +ac.name + " amount : " + amount + "date :" +date);
    }

  }




  
}
