
public class Count_zeros {

	    
	    /* if 0 is present in arr[] then returns the index of FIRST occurrence 
	       of 0 in arr[low..high], otherwise returns -1 */


		public static int countZerosRec(int num){
			 // Find index of first zero in given array 
	        if(num % 10 == 0)
	        return 1 + countZerosRec(num / 10);
	         else if (num / 10 == 0)
	        return 0;
	        else
	        return countZerosRec(num / 10);
		}
	}
