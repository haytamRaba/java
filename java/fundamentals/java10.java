public class java10 {
  public static void main(String[] args) {
    // 2d array = an array ehere each element is an array 
    //             useful for sorting a matrix

    String[][] groceries = {
      {"apple","banana","kiwi"},
      {"chicken","beef","fish"},
      {"tomato","carrot","onion","potato"}
    };

    char [][] telephone ={{'1','2','3'},
                          {'4','5','6'},
                          {'7','8','9'},
                          {'*','0','#'}};


    System.out.println("foreach : ");
    for(String[] foods : groceries)
    {
      for(String item : foods){
        System.out.print(item + "\t");
      }
      System.out.println();
    }
    System.out.println("for : " );
    for(int i =0;i<groceries.length;i++)
    {
      for(int j =0; j<groceries[i].length;j++){
        System.out.print(groceries[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println("telphone");
    for(int i=0;i<telephone.length;i++){
      for(int j=0; j<telephone[i].length;j++ ){
        System.out.print(telephone[i][j]+"\t");
      }
      System.out.println();
    }

  }
}
