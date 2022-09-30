import java.util.*;
public class arraytsum {
    public static void tsum (int[]trs)
    {
        Scanner sc= new Scanner(System.in);
        
            int x= sc.nextInt();
        
        for(int i=0; i<trs.length; i++)

        {
            for(int j=i+1; j<trs.length;j++)
            {
                for(int k=j+1; k<trs.length; k++)

                {
                    if(trs[i]+trs[j]+trs[k]==x)
                    {
                        System.out.println("(" + trs[i] + "," + trs[j] + "," + trs[k] +")");
                    }
                }
            }
        }
    }
    public static void main(String[]args)
    {
        int trs[]= {1, 2, 3, 4, 5, 6, 7 };
        tsum(trs);
//         calling
    }
    
}
