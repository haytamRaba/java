import java.util.Scanner;
public class quizGame {
  public static void main(String[] args) {
    // java quiz game ;
    Scanner sc = new Scanner(System.in);

    String [] questions={"what is the main function of a router ? ",
                         "which part of computer is consired the brain ? ",
                         "what year was facebook launched ? ",
                         "who is known as the father of computer ? ",
                        "what was the first programming language ? "};
    String[][] options={
                        {"1.Storing files",
                         "2.Encrypting data",
                         "3.Directing internet traffic",
                         "4.Manging passwords"},

                        {"1.cpu",
                        "2.hard drive",
                        "3.Ram",
                        "4.Gpu"},

                        {"1.2000",
                        "2.2004",
                        "3.2006",
                        "4.2008"},

                        {"1.steve jobs",
                        "2.bill gates",
                        "3.elon musk",
                        "4.charlin babbage"},

                        {"1.c",
                        "2.assembly",
                        "3.fortran",
                        "4.java"}
                                      };
  int [] answers ={3,1,2,4,3};
  int score =0;
  int choice;

   System.out.println("***********************************");
   System.out.println("Welcome to the java Quiz Game!!!");
   System.out.println("***********************************");

  for(int i=0; i<questions.length;i++){
    System.out.println(questions[i]);

    for (String option : options[i]){
      System.out.println(option);
    }
    System.out.println("choose (1 - 4 ) : ");
    choice = sc.nextInt();
    if(choice == answers[i]){
      score++;
      System.out.println("*****************************************************");
      System.out.printf("CORRECT! , YOUR CUURENT SCOORE : %d\n",score);
      System.out.println("******************************************************");
      
    }
    else{
      System.out.println("*****************************************************");
      System.out.printf(" Wrong!!! , YOUR CUURENT SCOORE : %d\n",score);
      System.out.println("******************************************************");

    }
  }
  System.out.println("final score : "+score + " of 5");
            
  


  sc.close();
  }
  
}
