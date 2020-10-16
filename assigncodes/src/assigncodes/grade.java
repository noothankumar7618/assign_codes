package assigncodes;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		
		int average=(a+b+c)/3;
		if(average >=90&&average <=100 ) {
			System.out.println("A");
		}
		else if(average >=80&&average <=89) {
			System.out.println("B");
		}
		else if(average >=70&&average <=79) {
			System.out.println("C");
		}
		else if(average >=60&&average <=69) {
			System.out.println("D");
		}
		else  {
			System.out.println("F");
		}
		
		
		
	}

}