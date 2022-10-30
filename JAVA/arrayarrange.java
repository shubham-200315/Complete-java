import java.util.*;
public class arrayarrange {
      public static void main (String []args)
      {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
       int i=1;
       int j=n-1;
       int filling=1;
       while(i<=j)
       {
        // we have to an put odd number at the starting so we have to see
        // if the remainder is 1 
           if(filling%2==1)
           {
            arr[i]=filling;
            filling +=1;
            i++;
            
           }
        //    if not
           else {
        
            arr[j]=filling;
            filling +=1;
            j-=1;
           }
       }
         for(i=0; i<n;i++)
         {
           System.out.print(arr[i]);
         }
         
      }
}
