package Java.kkrecur;

public class helper {
    public static void main (String []args)
    {
        
        System.out.println(nofsteps(41));
    }
    public static int nofsteps(int n)
    {
        return help(n,0);
    }
    private static int help(int n, int steps)
    {
        if(n==0)
        {
            return steps;
        }
        if(n%2==0)
        {
        return help(n/2, steps+=1);
        }
        return help(n-1, steps+=1);
    }
}
