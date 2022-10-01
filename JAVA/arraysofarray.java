public class arraysofarray {
    public static void main(String []args)
    {
      int arr1 []= {1,2,3};
      int arr2[]= {4,5,6};
      int sum[]= new int [arr1.length+1];
    int carry=0;
    int num =0;
    int k= Math.max(arr1.length , arr2.length);
      
    int i= arr1.length-1;
    int j = arr2.length-1;
    while (i>=0&&j>=0)
    {
        
        num =arr1[i] + arr2[j] + carry;
        sum[k] = num %10;
        carry = num/10;
        i--;
        j--;
        k--;
    }
    while (i>=0)
    {
        
        num =arr1[i] + arr2[j] + carry;
        sum[k] = num %10;
        carry = num/10;
        i--;
        k--;
    }
    while (j>=0)
    {
        
        num =arr1[i] + arr2[j] + carry;
        sum[k] = num %10;
        carry = num/10;
        j--;
        k--;
    }
    sum[0] = carry;




      for( i=0; i<sum.length; i++)
      {
        System.out.print(sum[i]);
      }

    
    }
}
