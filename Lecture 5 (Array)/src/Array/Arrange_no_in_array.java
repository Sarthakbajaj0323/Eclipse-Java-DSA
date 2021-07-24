package Array;

public class Arrange_no_in_array {
	 public static void arrange(int[] arr, int n) {
	    	//Your code goes here
	      if(n==0){
	          return;
	      }
			int var=1;
	        int i=0;
	        while(i<=(n-1)/2){
	            arr[i]=var;
	            var+=2;
	            i++;
	            
	        }
	        int flag=2;
			int j=n-1;
	        while(j>(n-1)/2){
	            arr[j]=flag;
	            flag+=2;
	            j--;
	        }
	    }
}
