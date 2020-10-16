package october3;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		int[] arr2= {5,4,1,6,9,11};
		targetSum(arr2,12);
	}
	public static void targetSum(int[] arr, int target) {
		for(int i=0;i<arr.length-1;i++) {
			for (int j=i+1; j<arr.length;j++) {
				int currSum=arr[i] + arr[j];
				if(currSum ==target) {
					System.out.println("yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}