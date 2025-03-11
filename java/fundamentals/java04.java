
class java04{
  public static void main(String [] args){
    // printf() = is a method used to format output 
    // %c => char %b => boolean

    String name = "Haytam_Raba";
    int age = 20;
    double height = 176.5;
    boolean isStudent = true;

    System.out.printf("My name is  %s\n",name);
    System.out.printf("I am %d years old\n",age);
    System.out.printf("I am %.1f cm tall\n",height);
    System.out.printf("Student : %b\n",isStudent );
    
    int l1=1;
    int l2=23;
    int l3=456;
    int l4=7890;

    System.out.printf("%4d\n",l1);
    System.out.printf("%4d\n",l2);
    System.out.printf("%4d\n",l3);
    System.out.printf("%4d\n",l4);
  }
}