import java.util.*;
public class arraysort {
    public static int[] takeinpUt()
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int srt[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            srt[i] = sc.nextInt();
        }
        return srt;
    }

public static void sort(int[]srt)
{
    for(int i=0; i<srt.length-1; i++)
    {
     for(int j=0;j<srt.length-i-1; j++)
        if(srt[j]>srt[j+1])
        {
            int temp= srt[j];
            srt[j]=srt[j+1];
            srt[j+1]= temp;
        }
     }
    }


public static void main(String[]args)
{
  int srt [] = takeinput();
  sort(srt);
//     function calling

  for(int i=0; i<srt.length; i++)
  {
    System.out.print(srt[i] + ",");
  }
}
}


