
public class fibonacci {
  public static int fibo(int n)   
  {
    if(n==0||n==1)
    {
        return n;
    }
    int a =fibo(n-1);
    int b=fibo(n-2);
    return a+b;
  }
  public static void main(String[]args)

  {
    int n=5;
  
    for(int i=0; i<n; i++)
    {
        System.out.print(fibo(i)+ " ");
    }
  }
}

