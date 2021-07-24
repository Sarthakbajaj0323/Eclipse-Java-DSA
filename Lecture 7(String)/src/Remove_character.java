
public class Remove_character {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    String word="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=c){
                word+=input.charAt(i);
            }
        }
	return word;
	}
}
