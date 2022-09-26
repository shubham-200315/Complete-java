import java.util.*;
public class stringpalindrome {

    public static void Palindrome (String str)
    {
    
        int i=0;
        int j = str.length()-1;
        while(i!=j){
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println(" not palindrome");
                break;
            }
            else {
                
                i++;
                j--;
            }
        }
        System.out.println("  palindrome");
       
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String str=  sc.nextLine();
        Palindrome(str);
    }
}
