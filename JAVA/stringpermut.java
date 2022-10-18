import java. util.*;
public class stringpermutation {
    public boolean ispermut(String str1, String str2)
    {
        
        if(str1.length()!=str2.length() )
        {
            return false;
            
        }
        int frequency[]= new int[256]; 
        // 256 because in java only 256 different character can be stored
        for(int i=0; i<256; i++)
        {
            frequency[i]=0;
        }
        for(int i=0; i<str1.length(); i++)
        {
            char ch = str1.charAt(i);
            ++frequency[ch];
            // ch stores the ascii values of given alphabet 
            
        }
        for(int i=0; i<str2.length(); i++)
        {
            char ch = str2.charAt(i);
            --frequency[ch];
            
        }
        for(int i=0; i<256; i++)
        {
            
            if(frequency[i]!=0) 
            {
                return false;
            }
            
        }
        return true ;
    }
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.nextLine();
		String input2 = s.nextLine();
stringpermutation result = new stringpermutation();

boolean x= result.ispermut(input1, input2);
System.out.println(x);
s.close();
	}
    
    
}
