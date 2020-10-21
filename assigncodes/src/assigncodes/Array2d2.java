package assigncodes;

import java.util.Scanner;

public class Array2d2 {

	public static void main(String[] args) {
	int[][] arr=new int[3][3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
	
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
	}
	int diagonal1=0,diagonal2=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(i==j) {
				diagonal1+=arr[i][j];
			}
			if((i+j)==(arr.length-1)) {
				diagonal2+=arr[i][j];
				
				
			}
	}
		}
	System.out.println(diagonal1+" "+diagonal2);
}
}
