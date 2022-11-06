
public class arrayintersect {
    
    public static int [] intersection(int []intr1, int intr2[])
    {
        int k=0000;
        int ans[] = new int[intr2.length];
        for(int i=0; i<intr1.length; i++)
        {
            for(int j=0; j<intr2.length; j++)
            {
                if(intr1[i]==intr2[j])
                {
                 ans[k] = intr1[i];
                  k+=1;
                }
            }
        }
        return ans;
    }
    public static void main (String [] args)
    {
        int intr1[] = {1,2,3,4,5,6};
        int intr2[]= {3,2,5,6,7};
        int ans[]= intersection(intr1, intr2);
        for(int i=0; i<ans.length; i++)
        {
            System.out.println(ans[i]);
//             printing
        }
        
    }
    
}
