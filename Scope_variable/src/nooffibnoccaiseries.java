
public class nooffibnoccaiseries {
	public static boolean checkMember(int n){
	
		
			
	        if(n < 2){
	            return true; // as series start from 0,1,1.....
	        }
	        int a = 1, b = 1;
	        
	        while(a <= n){
	            if(a == n) return true;
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	        return false;

	}

}
