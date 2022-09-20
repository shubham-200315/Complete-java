
public class arraybinary {
    public static int binarysearch(int []input , int element)
    {
        int start=0;
        int end = input.length - 1;
        while(start<= end)
        {
            int mid= (start+ end)/2;
            if(element==input[mid])
            {
                return mid;
            }
            else 
            if(element>input[mid])
            {
              start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main (String[]args)
    {
        int[]input = { 1,2,3,4,5,6};
        int index= binarysearch(input , 5);
        System.out.println(index);
    }
}
