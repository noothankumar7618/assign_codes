package assigncodes;

public class mergesort {
	public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int p1=0;
		int p2=0;
		int p3=0;
		int[] res=new int[arr1.length+arr2.length];
		while(p1<arr1.length&&p2<arr2.length) {
			if(arr1[p1]<arr2[p2]) {
				res[p3]=arr1[p1];	
				p1++;
				
			}else {
				res[p3]=arr2[p2];
				p2++;
				
			}
			p3++;
		}
		while(p1<arr1.length) {
			res[p3]=arr1[p1];
			p1++;
			p3++;
		}
		while(p2<arr2.length) {
			res[p3]=arr2[p2];
			p2++;
			p3++;
		}
		return res;
	}

	public static void main(String[] args) {
int[] arr1= {2,5,7,9,11};
int[] arr2= {1,3,7,9,10};
int[] merged=mergeTwoSortedArrays(arr1,arr2);
for(int i=0;i<=merged.length;i++) {
	System.out.println(merged[i]+" ");
}

	}

}
