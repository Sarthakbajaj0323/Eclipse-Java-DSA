
public class Palindrome {
	    
	     static boolean isPalRec(String str,int s, int e) 
	    { 
	        
	        if (s == e) 
	            return true; 
	  
	        if ((str.charAt(s)) != (str.charAt(e))) 
	            return false; 
	  
	        
	        if (s < e + 1) 
	            return isPalRec(str, s + 1, e - 1); 
	  
	        return true; 
	    } 
	    


	        
		public static boolean isStringPalindrome(String input) 
	    {   int n = input.length(); 
	  
	        if (n == 0) 
	            return true; 
	  
	        return isPalRec(input, 0, n - 1); 
	   

		}
	    
	    
	    
	    
	
}
