public class powerr {
    
    public static int a(int x, int n)
    {
        if(n==0)
        {
            return 1;

        }
        // previous value of function is stored in ans
            int ans = a(x,n-1);
            // then multiplied with x
            return x*ans;
    }
    public static void main(String[]args)
    {
        int x=3;
        int n=4;
        int ans = a(x, n);
        System.out.print(ans);
    }

}
