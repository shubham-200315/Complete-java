

public class arrayendzero {
    
    public static int [] endZero(int[]edz)
    {
        int k=0;
        int temp[] = new int[edz.length];
        for(int i=1;i<edz.length-1;i++)
        {
            if (edz[i]!=0)
            {
              temp[k] = edz[i];
           
             k+=1;
            }
            
           
        }
        return temp;
    }
    public static void main (String []args)
    {
        int []edz = {2, 0, 0, 1, 3, 0, 0};
         int temp[] = endZero(edz);
        for (int i=0; i<temp.length;i++)
        {
            System.out.print(temp[i]);
        }
    }
}
