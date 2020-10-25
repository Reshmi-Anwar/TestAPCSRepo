public class Demo{
  public static void printLoop(int x){
    for(int i = 1; i <= x; i++){
      for(int j = 0; j <= x - i; j++){
        System.out.print(i);
      }
      System.out.println();
    }
  }
  //public static void main(String[] args){
  //  printLoop(5);
  //}


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

  public static String arrayDeepToString(int[][] arr){
    String array = "{";
    for(int i = 0; i < arr.length; i++){
      array += arrToString(arr[i]);
      if(i < arr.length - 1){
        array += ", ";
      }
    }
    return (array + "}");
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] array = new int[rows][cols];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        array[i][j] = (int)(Math.random() * maxValue);
      }
    }
    return (array);
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] array = new int[rows][];
    for(int i=0; i< rows; i++){
      array[i] = new int [(int)(Math.random() * (cols + 1))];
      for(int j=0; j<array[i].length;j++){
        array[i][j] = (int)(Math.random() * maxValue);
      }
    }
    return array;
  }

}
