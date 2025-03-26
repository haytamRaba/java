import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {

    // generics = a concept where can write a class , interface or method
    //            that is compatible with different data types
    //            <T , U , ...> type parameter (placeholder that gets replaced with a real type)
    //            <any Type> type argument ( specifies the type )    

    Box<String> box = new Box<>();
    Box<Integer> nums = new Box<>();
    Box<Double> nums2 = new Box<>();

    Product<String , Double> product = new Product<>("soda",3.2);
    Product<String , Integer> product2 = new Product<String,Integer>("water", 5);

    box.setItem("box1");
    System.out.println(box.getItem());

    nums.setItem(0);
    System.out.println(nums.getItem());

    nums2.setItem(3.14);
    System.out.println(nums.getItem());


    System.out.println( product.getItem() + " " + product.getPrice());
    System.out.println( product2.getItem() + " " + product2.getPrice());



  }
  
}
