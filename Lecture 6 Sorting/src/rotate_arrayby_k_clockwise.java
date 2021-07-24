
public class rotate_arrayby_k_clockwise {

	 public static int arrayRotateCheck(int[] arr){
	        //Your code goes here
	        int count=0;
	        for(int i=arr.length-1;i>0;i--){
	            count++;
	            if(arr[i-1]>arr[i]){
	                return count;
	            }
	            
	        }
			return 0;
	    }
}
