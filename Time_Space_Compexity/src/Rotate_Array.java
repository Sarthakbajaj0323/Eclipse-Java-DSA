
public class Rotate_Array {

	 public static void rotate(int[] arr, int d) {
	     int i  =0;
	     int j  = arr.length-1;
	     while(i<j) {
	    	 int temp =  arr[i];
	    	 arr[i] = arr[j]; 
	    	 arr[j] = temp;
	    	 i++;
	    	 j--;
	     }
	     i = 0;
	     j = arr.length-d-1;
	     while(i<j) {
	    	 int temp =  arr[i];
	    	 arr[i] = arr[j]; 
	    	 arr[j] = temp;
	    	 i++;
	    	 j--;
	     }
		 i =  arr.length-d;
	     j = arr.length-1;
	     while(i<j) {
	    	 int temp =  arr[i];
	    	 arr[i] = arr[j]; 
	    	 arr[j] = temp;
	    	 i++;
	    	 j--;
	     }
		 
	    }
}
