import java.util.*;
public class arrayrotate {
    public static void rotation(int rtn[])
    {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int temp =0;
       while(x!=0)
       {
           for(int i=0; i<rtn.length-1; i++)
           {
                temp = rtn[i];
                rtn[i]=rtn[i+1];
                rtn[i+1]=temp;

            }

            --x;
           }
       }
       
    
    public static void main (String []args)
    {
        int []rtn = {1,2,3,4,5,6,7};
        rotation(rtn);
         
        for (int i=0; i<rtn.length;i++)
        {
            System.out.print(rtn[i]);
        }
    }
}
