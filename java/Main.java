// strings

public class Main{
  public static void main(String [] args){
   String name ="  haytam raba  ";
   int length = name.length();
   char car = name.charAt(0); 
   int index = name.indexOf("a");
   int lastIndex = name.lastIndexOf("a");
   name = name.toUpperCase();
   name = name.toLowerCase();
   name = name.trim();
   name = name.replace("a","*");
   boolean checkMyName =name.isEmpty();
   System.out.println(name);
   if (!checkMyName){
     if(name.contains("*"))
      {
       name = name.replace("*","A");
      }
      else{
       name = name.replace("a","*");
      }
    }
    else{
     System.out.println("name is empty!");
    }
    if(name.equalsIgnoreCase("haytam raba")){
      if(name.equals("hAytAm rAbA"))
      {
        System.out.println("name : "+ name);
      }
      
    }
    
  }
}