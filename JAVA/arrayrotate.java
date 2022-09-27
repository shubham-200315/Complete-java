public class arraysdlargerst {
    
    public static void  secondLargest(int[]slr)
    {
      int x = slr.length;
        int secLargest=0;
    
        for(int i=0; i<slr.length-1;i++)
        {
            for(int j=0; j<slr.length-i-1; j++)
            {

                if(slr[j]>slr[j+1])
                {
                 int temp= slr[j];
                 slr[j]=slr[j+1];
                 slr[j+1]=temp;
                }
            }
        }
    
         secLargest = slr[x-2];
         
          System.out.println(secLargest);
         
    }
    public static void main(String []args)
    {
        int slr []={1,4,113,95,5};
        secondLargest(slr);
     
    }
}

