package java03;
public class java03 {
  public static void main(String[] var0) {
     // Create instances of java03_user with different constructors
     java03_user var1 = new java03_user("haytam");
     java03_user var2 = new java03_user("HAYTAM", "haytamraba11@gmail.com");
     java03_user var3 = new java03_user("HAYTAM", "axyzef@ghijklm.nop", 90);
     java03_user var4 = new java03_user();

     // Print user details
     System.out.println(var1.username + " " + var1.email + " " + var1.age);
     System.out.println("user 2");
     System.out.println(var2.username + " " + var2.email + " " + var2.age);
     System.out.println("user 3");
     System.out.println(var3.username + " " + var3.email + " " + var3.age);
     System.out.println("user 4");
     System.out.println(var4.username + " " + var4.email + " " + var4.age);
  }
}