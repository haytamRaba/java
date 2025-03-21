import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
  public static void main(String[] args) {
    
    // convert the mp3 file to wav 


    String filePath = "Olas de Trap - Cumbia Deli.wav";

    File file = new File(filePath);


    try( Scanner sc = new Scanner(System.in);  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file) ){

    

      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      // System.out.println("no problem");
     
      String response = " ";

      while(!response.equals("Q")){
        System.out.println("P = play");
        System.out.println("S = stop");
        System.out.println("R = Reset");
        System.out.println("Q = Quit");

        System.out.print("enter your choice: ");
        response= sc.nextLine().toUpperCase();
        
        if(response.equals("P")){
          clip.start();
        }
        else if ( response.equals("S") ){
          clip.stop();
        }
        else if(response.equals("R")){
          clip.setMicrosecondPosition(0);
        }
        else if(response.equals("Q")){
          clip.close();
        }
        else{
          System.out.println("invlchoice !");
        }
        
      }
      
    }
    catch(FileNotFoundException e){
      System.out.println(" could not locate file ");
    }
    catch( LineUnavailableException e ){
      System.out.println("unable to acces audio resource");
      
    }
   catch( UnsupportedAudioFileException e){
    System.out.println("audio file is not supported");

    }
    catch(IOException e){

      System.out.println("seomething went wrong");
    }
    finally{
      System.out.println("good bye");
    }
  }
  
}
