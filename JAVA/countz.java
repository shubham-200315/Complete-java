package Java.kkrecur;

public class countz {
    public static void main (String []args)
    {
      System.out.println(county(30203, 0));
    }
    public static int county(int n, int count)
    {
        if (n==0)
        {
            return count;
        }
        int rem = n%10;
        if(rem==0)
        {
            return county(n/10,count+1);
        }

              return county(n/10,count);  
    }
}
