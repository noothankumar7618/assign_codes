package october3;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		boolean isPrime=true;
		int count=2;
		while(count<=Math.sqrt(n)){
			if(n%count==0) {
				System.out.println("Not Prime");
				isPrime=false;
				break;
			}
			count++;
		}
		if(isPrime==true) {
			System.out.println("prime");
		}
}
}
