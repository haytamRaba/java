import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    // hashmap = a data structur that stores key-value pairs
    //           keys are unique , but values can be duplicated 
    //           does not maintain any order , but is memory efficient 
    //            hashmap < key , value >

    HashMap<String , Double> map = new HashMap<>();

    map.put("apple" , 15.2 );
    map.put("orange" , 10.2 );
    map.put("banana" , 13.0 );

    //map.remove("banana");

    //System.out.println(map.get("banana"));         : 13.0

    //System.out.println(map.containsKey("banana")); : true
    // System.out.println(map.containsKey("lemon"));  : false
    // System.out.println(map.containsValue(13.0));
    // System.out.println(map.size());               : 3

    for(String key : map.keySet() ){
      System.out.println(key + " : " + map.get(key) + " DH");
    }
   }
  
}
