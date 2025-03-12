import java.util.Scanner;
public class banking {
  static Scanner sc = new Scanner(System.in);
  public static void main(String [] args){
    // java banking program
    
    double balance=0;
    int choice;
    boolean istrue =true;
   System.out.println("  ****************");
   System.out.println("  banking program"); 
   System.out.println("  ****************");

   while( istrue ){
    System.out.println(  "  ------------------------------");
   System.out.println("  ****************");
   System.out.println("  1. Show Balance");
   System.out.println("  2. Deposit");
   System.out.println("  3. Withdraw");
   System.out.println("  4. Exit");
   System.out.println("  ****************");

   System.out.print("  enter your choice ( 1 - 4 ) : ");
   choice = sc.nextInt();

   System.out.println(  "  ------------------------------");


   switch(choice){
    case 1 -> {
                System.out.print("   balance : ");
                showbalance(balance);
              }

    case 2 -> {
                  System.out.println("  deposit");
                  balance += deposit();
              }
    case 3 -> {
                  System.out.println("  withdraw ");
                  balance -= withdraw(balance);
              }
    case 4 -> istrue = false;
    default -> System.out.println("  chose between ( 1 - 4 ) : ");

   }
  }

    System.out.println("\n  have a nice day !\n");

    sc.close();
  }
  static void showbalance(double balance){
    System.out.printf("\t %.2f DH\n",balance);

  }
  static double deposit(){
    double amount;
    System.out.print("  enter an amount to be deposit : ");
    amount = sc.nextDouble();
    if (amount < 0){
      System.out.println("  amount should be > 0");
      return 0;
    }
    else{
      return amount;
    }

  }
  static double withdraw(double balance){
    double amount;
    System.out.print("  Enter amount to be withdrawn : ");
    amount = sc.nextDouble();

    if(amount > balance){
      System.out.println("  insufficient funds");
      return 0;

    }
    else{
      return amount;
    }

  }
}
