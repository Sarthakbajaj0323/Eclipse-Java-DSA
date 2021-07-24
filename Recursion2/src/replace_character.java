
public class replace_character {



	public static String replaceCharacter(String input, char c1, char c2) {
	
        
        if(input.length()==0)
            return input;
        
        String ans="";
        if(input.charAt(0)!=c1)
            ans=ans + input.charAt(0);

        if(input.charAt(0)==c1)
            ans=ans + c2;
        
        String smallans=replaceCharacter(input.substring(1),c1,c2);
            return ans+smallans;
        
        
	}
}