package october3;

import java.util.Scanner;

public class nofd {
	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int counter=0;
		while(n!=0) {
			n=n/10;
			counter++;
		}
		System.out.println(counter);
	}

}
