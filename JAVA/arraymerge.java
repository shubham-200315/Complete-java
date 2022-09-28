public class arraymerge {
    
    public static int[] merging(int a[], int b[])

{ 
    int k=0,i=0,j=0;
    int mrg[]=  new int[a.length+b.length];
   
            
        while(i<a.length&&j<b.length)
        {

            if(a[i]<b[j])
            {
            
                mrg[k] = a[i];
                k+=1;
                i+=1;
            }
            else 
            {
                mrg[k]=b[j];
                k+=1;
                j+=1;
            }
        }
        
    
    while(i<a.length)
    {
       mrg[k]= a[i];
       k+=1;
       i+=1;
    }
    while(j<b.length)
    {
       mrg[k]= b[j];
       k+=1;
       j+=1;
    }
  
    return mrg;
}
public static void main(String[]args)
    {
      int a [] = {1,2,3,4,5};
      int b [] = {6,7,8,9};
      int mrg[]=   merging( a, b);
     
      for(int i=0; i<mrg.length; i++)
      {
        System.out.println(mrg[i]);
      }
      System.out.println();
    }
}
