public class arrayswap {
    public static void swap(int swp[])
    {
        for(int i=0; i<swp.length; i+=2)
        {
         int temp = swp[i];
         swp[i] = swp[i+1];
         swp[i+1]=temp;
        }
    }
    public static void main(String [] args)
    {
        int swp[] = {1,2,3,4,5,6,7,8};
       swap(swp);
       for (int i = 0; i < swp.length; i++) 
    {
        System.out.print(swp[i]);
    }

    }
}
