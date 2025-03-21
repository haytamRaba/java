
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Main {
  public static void main(String[] args) {
    
   // ArrayList = a resizeable array that stores objects ( autoboxing )
   //             arrays are fixed in size , but arraylist can change

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Double> list2 = new ArrayList<>();
    ArrayList<String> list3 = new ArrayList<>();

    list.add(3);
    list.add(1);
    list.add(2);

    list2.add(3.2);
    list2.add(1.3);
    list2.add(2.3);

    list3.add("qwert");
    list3.add("yuiop");
    list3.add("asdfg");

    list.remove(0);
    list.add(1);
    System.out.println(list);
     list.set(0, 4);
    

    System.out.println("* *  *  *  *  *   *  *");

    System.out.println(list2);

    System.out.println("* *  *  *  *  *   *  *");

    System.out.println(list3);
    list3.set(0, " null");

    System.out.println("* *  *  *  *  *   *  *");

    System.out.println(list3.get(0));
    System.out.println("  " + list3.size());

    System.out.println("* *  *  *  *  *   *  *");

    Collections.sort(list);
    System.out.println(list);

    

  }
  
}
