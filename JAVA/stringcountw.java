import java.util.*;
public class stringcountw {
    
    public static int  countWord( String str)
    {
     
        if(str.length()==0)
        {
            return 0;
        }
        int x =1;
        for(int i=0; i<str.length();i++)
        {
        if (str.charAt(i)==' ')
        {
            x++;
        }
        }
        System.out.println(x);
     return x;

    }
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countWord(str);
    }
}
