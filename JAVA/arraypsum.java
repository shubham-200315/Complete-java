import java.util.*;
public class arraypsum 
{
    public static void psum(int[]prs)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0; i<prs.length;i++)
        {
            for(int j=i+1; j<prs.length;j++)
            {
            if(prs[i]+prs[j]==x)
            {
                if(prs[i]>prs[j])
                {
                    System.out.println("(" + prs[j] + "," + prs[i] + ")");

                }
                else
                {
                    System.out.println("(" + prs[i] + "," + prs[j] + ")");
                }
            }

            }
        }
    }
    public static void main(String [] args)
{
    int prs[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};
     psum(prs);
//         calling



}

}
