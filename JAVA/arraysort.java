import java.util.*;
public class arraysort {
    public static int[] takeinput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int srt[] = new int[n];
        for (int i = 0; i < n; i++) {
            srt[i] = sc.nextInt();
        }
        return srt;
    }
    public static void sort (int srt[]) {
        
        for (int i = 0; i < srt.length-1; i++) {
            
              if(srt[i]<=srt[i+1])
              {
               System.out.println(srt[i]);
              }
              else
              {
                continue;
              }
            }
        
    }
    public static void main(String[]args)
    {
        int srt[] = takeinput();
        sort(srt);
    }

}
