public class arrayinsertion {
   public static void insert(int input [])

   {
    for(int i=1; i<input.length; i++)
    {
        for(int j = i-1; j>=0; j--)
        {
            if(input[j]>input[j+1])
            {
                int temp = input[j];
                input[j]=input[j+1];
                input[j+1]= temp;
            }
        }
    }
   }
   public static void main(String[]args)
   {
     int input [] = {2,4,3,3,1};
     insert(input);
     for(int i=0; i<input.length; i++)
     {
       System.out.println(input[i]);
     }
   }
}
