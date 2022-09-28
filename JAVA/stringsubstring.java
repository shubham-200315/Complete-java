

public class stringsubstring {
    public static void sstring(String str)
    {
        for(int i=0; i<str.length();i++)
        {
            String temp = "";
            System.out.println(str.charAt(i));
           temp = str.charAt(i) + temp;
            for(int j=i+1; j<str.length(); j++)
            {
                temp =  temp + str.charAt(j) ;
                System.out.println(temp);
            }
        }
    }
    public static void main(String []args)
    {
        String str = "abcd";
        sstring(str);
    }
}
