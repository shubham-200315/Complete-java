package Java.kkrecur;

public class arsort {
     public static void main(String []args)
     {
      int arr [] = {1,3,5,70};
      System.out.println(sorted(arr, 0));
     }
     public static boolean sorted(int []arr, int index)
     {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
     }
}
