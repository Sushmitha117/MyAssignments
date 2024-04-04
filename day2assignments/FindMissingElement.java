package week1.day2assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		   int[] arr =  {1, 4,3,2,8, 6, 7};
		   Arrays.sort(arr);
	        int n = arr.length + 1; 
	        int r = n * (n + 1) / 2;
	        int sum = 0;

	       
	        for (int i=0;i<arr.length;i++)
	        {
	            sum=sum+arr[i];
	        }

	        int missingNumber = r - sum;

	      
	        System.out.println("Missing number is: " + missingNumber);
	    }
	

	}


