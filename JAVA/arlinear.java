package Java.kkrecur;

public class arlinear {
    public static void main(String []args)
    {
        int arr[] = { 1,4,5,8};
        System.out.println(find(arr, 5, 0));
        System.out.println(findi(arr, 5, 0));
    }
    static boolean find(int []arr, int target, int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
     static int findi(int []arr, int target , int index)
     {
        if(index== arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        else{

            return findi(arr, target, index+1);
        }
     }
}
