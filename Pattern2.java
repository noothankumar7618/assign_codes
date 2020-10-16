package october3;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

int n=4;
int i,j;
for( i=1;i<=n; i++) {
	for( j=1;j<=n;j++) {
	
	if(i==1||i==4||j==1||j==4)
	{
		System.out.print("*");	
	}
	else 
	System.out.print(" ");
	}
System.out.println();
}
}
	}

	
	