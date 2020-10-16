package october3;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		//largest N number
		Scanner scn=new Scanner(System.in);
				int n=scn.nextInt();
				
				int count=0;
				int max=Integer.MIN_VALUE;
				while(count<n) {
					int input=scn.nextInt();
					if(input>max) {
						max=input;
					}
					count++;
				}
				System.out.println(max);

	}

}
