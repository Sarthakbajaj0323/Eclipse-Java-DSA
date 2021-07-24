
public class Print_all_Substrings {

	public static void printSubstrings(String str){
        for(int j=0;j<str.length();j++){
             
		for(int i = j;i < str.length(); i++){
			System.out.println(str.substring(j, i+1));
		}
        }
	}
}
