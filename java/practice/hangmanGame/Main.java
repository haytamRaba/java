import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   // java Hangman Game   
   
   String filePath = "words.txt";
   Random random;
   ArrayList<String> words = new ArrayList<>();

   try (BufferedReader reader = new BufferedReader(new FileReader(filePath)) ){
    String line;

    while( ( line = reader.readLine() ) != null ){
      // spaces : trim()
      words.add(line.trim());
    }

   }
   catch( FileNotFoundException e ){
    System.out.println("could not find file");

   }
   catch(IOException e) {
    System.out.println("something went wrong");
   }

   random = new Random();
   // random number between 0 and length of words

   String word = words.get( random.nextInt( words.size() ) );

  //  System.out.println(words);

   


   Scanner sc = new Scanner(System.in);

   ArrayList <Character> wordstate = new ArrayList<>();
   int wrongGuesses = 0 ;

  
   for(int i = 0 ; i<word.length() ; i++){
    wordstate.add('-');
   }

   System.out.println("*  * * *  * * *  * *  * *  * * *   *");
   System.out.println("              java hangman           ");
   System.out.println("*  * * *  * * *  * *  * *  * * *   *");

   // while guesses less of the length of the correct word 
   while(wrongGuesses < 6 )
   {
        System.out.print(getHangmanArt(wrongGuesses));
        System.out.print("Word : ");
          // print the word length f word
        for(char c : wordstate){
          System.out.print(c+ " ");
        }
      
        System.out.println();
        System.out.print("Guess a letter : ");
        // take the caracter
        char guess = sc.next().toLowerCase().charAt(0);
      
        // verify if the caacter in the orignal word
        if(word.indexOf(guess) >= 0){

          System.out.println("correct guess!");

          for(int i =0;i < word.length() ; i++ ){
            // replace each correct carcter in the right place 
               if(word.charAt(i) == guess){

                  wordstate.set(i, guess);
                
                }
          }
          // if word dont contain any _ so the word is correct
          // because we replace them 
          if(!wordstate.contains('-')){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("You Win!");
            System.out.println("the word is : " + word);
            break;
          }
      
        }
        else{
          // wrong caracter 
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
