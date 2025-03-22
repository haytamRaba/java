import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   // java Hangman Game    
   
   String word ="pizza";

   Scanner sc = new Scanner(System.in);

   ArrayList <Character> wordstate = new ArrayList<>();
   int wrongGuesses = 0 ;

   for(int i = 0 ; i<word.length() ; i++){
    wordstate.add('-');
   }

   System.out.println("*  * * *  * * *  * *  * *  * * *   *");
   System.out.println("              java hangman           ");
   System.out.println("*  * * *  * * *  * *  * *  * * *   *");

   while(wrongGuesses < 6 )
   {
        System.out.print(getHangmanArt(wrongGuesses));
        System.out.print("Word : ");

        for(char c : wordstate){
          System.out.print(c+ " ");
        }
      
        System.out.println();
        System.out.print("Guess a letter : ");
        char guess = sc.next().toLowerCase().charAt(0);
      
        if(word.indexOf(guess) >= 0){
          System.out.println("correct guess!");
          for(int i =0;i < word.length() ; i++ ){
            if(word.charAt(i) == guess){
              wordstate.set(i, guess);
            }
          }
          if(!wordstate.contains('-')){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("You Win!");
            System.out.println("the word is : " + word);
            break;
          }
      
        }
        else{
          System.out.println("wrong guess!");
          wrongGuesses++;
        }
   }

   if(wrongGuesses >= 6 ){
    System.out.println(getHangmanArt(wrongGuesses));
    System.out.println("Game Over!");
    System.out.println("the word was : " + word);
   }
   System.out.println();
  // System.out.println(wordstate);
   sc.close();
  }

  static String getHangmanArt(int wrongGuesses){

    return switch(wrongGuesses){
      case 0 -> """

                """;
      case 1 -> """
                  O
                """;
      case 2 -> """
                  O
                 |
               """;
      case 3 -> """
                  O
                 /|
          """;
      case 4 -> """
                O
               /|\\
          """; 
     case 5 -> """
            O
           /|\\
           /
      """; 
     case 6 -> """
                O
               /|\\
               / \\
          """; 
      default ->""; 

    };

  }

}
