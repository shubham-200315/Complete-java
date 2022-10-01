public class array2Sort {
   public static void secondSort(int srt[])
   {
    
    int nz=0;
    int nt= srt.length-1;
    int i=0;
    while(i<=nt)
    {
        if(srt[i]==0)
        {
            //  it will not replace it stores value
            int temp= srt[nz];
            srt[nz]=srt[i];
            srt[i]=temp;
            nz++;
            i++;
        }
        else if (srt[i]==2)
        {
            int temp = srt[nt];
            srt[nt]=srt[i];
            srt[i]=temp;
            nt--;
            
        }
        else
        {
            i++;
        }
    }

   }
   public static void main( String[] args)
   {
    int srt [] = {1,0,0,1,2,0,1};
      secondSort(srt);
    for(int i=0; i<srt.length; i++)
    {
        System.out.println(srt[i]);
    }
   }
}
