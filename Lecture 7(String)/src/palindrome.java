
public class palindrome {

	public static boolean checkPalindrome(String str){
		String temp=str;
        String reverse="";
        
		for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=reverse.charAt(i)){
                return false;
            }
        }
        return true;
	
}

}

