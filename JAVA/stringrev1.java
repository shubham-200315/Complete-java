import java.util.*;
public class stringrev1 {
    
    public static void stringReverse(String str)
    {
        String reverse = "";
        for(int i=0; i<str.length();i++)
        {
        
             reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);

    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringReverse(str);
    }
}
