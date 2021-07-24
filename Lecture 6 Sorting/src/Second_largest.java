
public class Second_largest {

	 public static int secondLargestElement(int[] arr) {
	        //Your code goes here
	        
			int l=Integer.MIN_VALUE;
	        int s=Integer.MIN_VALUE;
	        int var=-2147483648;
	        for (int i=0;i<arr.length;i++){
	            if(arr.length<=1 ){
	                return var;
	            }
	            else if(l<arr[i]){
	                s=l;
	                l=arr[i];
	            }
	            else if(s<arr[i] && l!=arr[i]){
	                s=arr[i];
	            }
	        }
			return s;
		}
}
