public class Demo{
  public static void main(String[]args){
    int x;
    if (args.length > 0) x = Integer.parseInt(args[0]);
    else x = 5;
    printLoop(x);
  }

  public static void printLoop(int n){
    for (int i = 1; i <= n; i++){
      for (int j = 0; j <=  n - i; j++){
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
