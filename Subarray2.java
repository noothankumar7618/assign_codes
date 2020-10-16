package october3;


public class Subarray2 {

	public static void main(String[] args) {
	
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
		for(int j=i;j<arr.length;i++) { 
				sum=sum+arr[j];
				if(sum>max)
					max=sum;
			
		}
		
		}
		System.out.println(max);
	}

}
