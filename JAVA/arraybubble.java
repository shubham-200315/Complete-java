public class arraybubble {
    
    public static void buubles(int[]input)
    {
        for(int i=0; i<input.length-1; i++)
        {
         for(int j=0;j<input.length-i-1; j++)
         {
            if(input[j]>input[j+1])
            {
                int temp= input[j];
                input[j]=input[j+1];
                input[j+1]= temp;
            }
         }
        }

    }
    public static void main(String[]args)
    {
      int input [] = {2,4,3,9,1};
      buubles(input);
      for(int i=0; i<input.length; i++)
      {
        System.out.println(input[i]);
      }
    }
}
