package assigncodes;

import java.util.Scanner;

public class arraymanipulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long[] arr=new long[n+1];
		
		for(int i=0;i<m;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int val=sc.nextInt();
			arr[x]=arr[x]+val;
			if(y+1<=n)
			arr[y+1]=arr[y+1]-val;
			}
		//reconstruct the array
		
		for(int i=1;i<=n;i++) {
			arr[i]=arr[i]+arr[i-1];
		}
		
		//find the maximum
		long maxim=arr[0];
		for(int i=1;i<=n;i++) {
			maxim=Math.max(arr[i], maxim);
		}
		System.out.println(maxim);

	}

}
