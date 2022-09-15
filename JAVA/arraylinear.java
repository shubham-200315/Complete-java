import java.util.*;
public class arraylinear {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array");
        for( i=0; i<n;  i++)
        {
            arr[i]= sc.nextInt();
        }
      System.out.println("Enter the element you want to search");
        int x = sc.nextInt();
        for( i=0; i<arr.length;i++){
            if(arr[i]==x)
            {
             System.out.println(i);
            }
           
        }

    }
}
