
public class Remove_consective {


	 public static String removeConsecutiveDuplicates(String s) {
	  // Write your code here
	        if(s.length()==1){
	            return s;
	        }
	        
	        String ans="";
	        if(s.charAt(0) != s.charAt(1)){
	            ans=ans+s.charAt(0);
	        }
	        
	        String str1=removeConsecutiveDuplicates(s.substring(1)); 
	        return ans+str1;

	}
	}