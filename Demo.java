public class Demo{
  public static void printLoop(int x){
    for(int i = 1; i <= x; i++){
      for(int j = 0; j <= x - i; j++){
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    printLoop(5);
  }


  public static String arrToString(int[] arr){
    String array = "{";
    for(int i = 0; i < arr.length; i++){
      array += arr[i];
      if(i != arr.length - 1){
        array+= ", ";
      }
    }
    array += "}";
    return array;
  }
  public static String arrDeepToString(int[][] arr){
    String array = "{";
    for(int i = 0; i < arr.length; i++){
      array += arrToString(arr[i]);
      if(i < arr.length - 1){
        array += ", ";
      }
    }
    return (array + "}");
  }


}
