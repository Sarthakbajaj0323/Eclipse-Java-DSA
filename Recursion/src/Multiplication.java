
public class Multiplication {

		public static int multiplyTwoIntegers(int m, int n){
			
	        if(n==1)
	            return m;
		    int mul=m+multiplyTwoIntegers(m,n-1);
	        return mul;
		}
	
}
