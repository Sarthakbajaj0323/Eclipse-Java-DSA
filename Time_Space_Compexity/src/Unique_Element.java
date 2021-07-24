
public class Unique_Element {
		public static int findUnique(int[] arr){
				/* Your class should be named FindUnique
				 * Don't write main().
				 * Don't read input, it is passed as function argument.
				 * Return output and don't print it.
			 	 * Taking input and printing output is handled automatically.
				 */

		        
		          int res = 0; 
		        int n=arr.length-1;
		        for (int i = 0; i <= n ; i++) 
		        { 
		            res=res ^ arr[i]; 
		        }
		      
			
		    return res;
		    
			}
		
}
