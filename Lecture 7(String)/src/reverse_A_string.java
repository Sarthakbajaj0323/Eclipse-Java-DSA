
public class reverse_A_string {

public static String reverseWordWise(String input) {
		
        int i = input.length()-1;
        String ans="";
        while(i>=0){
            int j=i;
            while(i>=0 && input.charAt(i)!=' '){
                i--;           	
            }
              ans=ans+" "+input.substring(i+1,j+1);
            i--;
        }
		return ans.substring(1);
	}
}
