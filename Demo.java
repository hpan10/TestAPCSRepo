public class Demo{
  public static void main(String[]args){
    int x;
    if (args.length > 0) x = Integer.parseInt(args[0]);
    else x = 5;
    printLoop(x);
    int[][] a = {
      {2,5,3},
      {2,6,4},
      {4,2,6,24,75,3}
    };
    System.out.println(arrDeepToString(a).replace("}, ", "},\n "));
    System.out.println(arrDeepToString(create2DArray(5,6,4)).replace("}, ", "},\n "));
    System.out.println(arrDeepToString(create2DArrayRandomized(4,10,100)).replace("}, ", "},\n "));
  }


  public static void printLoop(int n){
    for (int i = 1; i <= n; i++){
      for (int j = 0; j <=  n - i; j++){
        System.out.print(i);
      }
      System.out.println();
    }
  }


  public static String arrToString(int[] arr){
    String str = "";
    for (int i = 0; i < arr.length; i++){
      str += arr[i];
      if (i < arr.length - 1){
        str += ", ";
      }
    }
    return "{" + str + "}";
  }


  public static String arrDeepToString(int[][] arr){
    String str = "";
    for (int i = 0; i < arr.length; i++){
      str += arrToString(arr[i]);
      if (i < arr.length - 1){
        str += ", ";
      }
    }
    return "{" + str + "}";
  }


  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] array = new int[rows][cols];
    for (int row = 0; row < rows; row++){
      for (int col = 0; col < cols; col++){
        array[row][col] = (int) Math.round(Math.random() * maxValue);
      }
    }
    return array;
  }


  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] array = new int[rows][];
    for (int i = 0; i < array.length; i++){
      array[i] = new int[(int) Math.round(Math.random() * cols)];
    }
    for (int row = 0; row < rows; row ++){
      for (int col = 0; col < array[row].length; col++){
        array[row][col] = (int) Math.round(Math.random() * maxValue);
      }
    }
    return array;
  }
}
