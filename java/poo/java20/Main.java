import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {

    // how to work with dates & times using java
    // (localDate, LocalTime , LocalDateTime , UTC timestamp)

    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    Instant instant = Instant.now();


    System.out.println(date);
    System.out.println(time);
    System.out.println(dateTime);
    System.out.println(instant);
  
    // custom format

    // LocalDateTime dateTime2 = LocalDateTime.now();
    // DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedPattern("dd-MM-yyyy HH:mm:ss");
    // String newDateTime = dateTime2.format(formatter);
    // System.out.println(newDateTime);

  LocalDateTime date2 = LocalDateTime.of(2025,11,26,0,0,0);


  if(date2.isEqual(date2)){
    System.out.println("happy birthday !");
    System.out.println(date2);
  }

  }
  
}
