package Array;

public class binary_search {

	public static int binarysearch(int[] input,int element) {
		
		int start=0;
		int end=input.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(element==input[mid]) {
				return mid;
				
			}else if(element>input[mid]) {
				start=mid+1;
			}else
				end=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,10,13,15};
		int stored=binarysearch(arr,10);
		System.out.println(stored);

	}

}
