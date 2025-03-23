import java.util.Timer;
import java.util.TimerTask;

public class Main {

  public static void main(String[] args) {
      // Timer = class that schedules tasks at specific times or periofically
      //         useful for : sending notifictions , scheduled updates , repetitiive actions


      // TimerTask = represnts the task that will be executed by the timer 
      //            you will extend the timerTask class to define your task
      //            create a subclass of timerTask and Override run() 

      Timer timer = new Timer();

      TimerTask task = new TimerTask(){
        int count = 3;
        @Override
        public void run(){
          System.out.println("Hello!");
          count--;
          if(count <= 0)
          {
            timer.cancel();
          }
        }
       };

      //  timer.schedule(task, 3000);
       timer.schedule(task, 3000,1000);



    
  }





  
}
