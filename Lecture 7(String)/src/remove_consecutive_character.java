
public class remove_consecutive_character {

	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here

        String ourString="";
        int j = 0;
        ourString+=input.charAt(0);
        for (int i=0; i<input.length()-1; i++){
            j = i+1;

            if(input.charAt(i)!=input.charAt(j)){
                ourString+=input.charAt(j);
            }

        }

        return ourString;

	}
}

/*
char lastchar=input.charAt(i);
String ans=""+input.charAt(i);
for (int i=1;i<input.length();i++) {
	if(input.charAt(i)!+=lastchar) {
		ans+=input.charAt(i);
		lastchar=input.charAt(i);
	}
}
return ans
		*/