
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int [] arr = {10,10,20,20,20,30,40};
		ArrayList<Integer> result = removeconsicutive(arr);
		for(int j: result )
		{
		    System.out.println(j);
		}
		
	}
	
	
	static ArrayList<Integer> removeconsicutive(int[]arr)
	{
	    ArrayList<Integer> removee = new ArrayList<>();
	    removee.add(arr[0]);
	    for(int i =1; i<arr.length; i++)
	    {
	        if(arr[i]!= arr[i-1])
	        {
	            removee.add(arr[i]);
	            
	        }
	    }
	 return removee;
	}
}
