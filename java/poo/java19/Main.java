
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.FileNotFoundException;
import java.io.IOException;




public class Main {
  public static void main(String[] args) {
    
    // how to write a file using java ( 4 popular options )
    
    // FileWriter = good for small or medium-sized text files
    // BufferdWriter = better performance for large amounts of text
    // PrintWriter = best for structured data , like reports or logs
    // fileOutpStream = best for binary files ( images, audio files)


    // how to read a file using java ( 3 popular options)

    // BufferReader + FileReader : best for reading text files line-by-line
    // FileInputStream : best forbinary files
    // RandomAccesFile : best for read/write specific portions of a large file


    // IO : INPUT / OUTPUT  
    
    String filePath = "C:\\Users\\HAYTAM\\Desktop\\test.txt";
    // FOR multiple line use """
    String textContent = """      

              Roses are Red 
              Violets are blue
              Booty booty booty
              Rockin EVEREWHERE!

        """;;
    
   
// write
    try( FileWriter writer = new FileWriter(filePath); ) {

      writer.write( textContent );
      System.out.println("file has been written");

    }
    catch( FileNotFoundException e){
      System.out.println("could not locate file location");

    }
    catch( IOException e){
      System.out.println("could not write file");

    }
// read 

try( BufferedReader reader = new BufferedReader( new FileReader(filePath) ) ){
  String line;
    while(( line = reader.readLine() ) != null ){
      System.out.println(line);
    }

}
catch( FileNotFoundException e ){

  System.out.println("could not locate file");

}
catch( IOException e ){
  System.out.println("something went wrong");

}
finally{

}


  }
  
}
