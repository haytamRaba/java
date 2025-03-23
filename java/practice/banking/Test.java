public class TEST {
  public static void main(String[] args){

    // bank

    Account ac1 = new Account("HAYTAM", 500);
    Account ac2 = new Account("Raba", 200);

    System.out.println(ac1.id);

    ac1.send(ac2,80);

    System.out.println(ac1.sold);
    System.out.println(ac2.sold);




  }
  
}
