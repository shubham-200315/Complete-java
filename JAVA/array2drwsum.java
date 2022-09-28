import java.util.*;
public class array2drwsum {
    
 public static int[][] takeInput()
 {
    Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int arr[][]= new  int[a][b];
      for(int i=0; i<a;i++)
      {
       for(int j=0; j<b;j++)
       {
        arr[i][j]= sc.nextInt();
       }
      }
      sc.close();
      return arr;
 }
 public static void main(String []args)
 {
    int arr[][] = takeInput();
    for(int i=0; i<arr.length; i++)
    {
        int sum =0; 
        for(int j=0; j<arr[i].length; j++)
        {
            sum= sum + arr[i][j];
        }
        System.out.println(sum + " ");
    }
 }
}
