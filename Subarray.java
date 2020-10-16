package october3;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
	
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		int max=arr[0];
		int max_so_for=arr[0];
		
		for(int i=0;i<arr.length;i++){
			max_so_for=Math.max(arr[i],max_so_for+arr[i]);
			if(max_so_for>max)
				max=max_so_for;
		
		}
		System.out.println(max);
	}
	
}