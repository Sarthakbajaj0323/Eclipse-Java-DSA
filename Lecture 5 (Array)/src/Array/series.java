package Array;

public class series {

	
		public static int[] arrange(int n){
			int arr[] = new int[n];
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
	         return arr;
		}
	}


