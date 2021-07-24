import java.util.*;

public class Extract_unique_characters {

	public static String uniqueChar(String str){
		// Write your code here


		HashSet<Character> set = new HashSet<>();
		String ans="";
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				list.add(str.charAt(i));
			}
		}
		for(char elem : set) {
			ans= ans+elem;
		}
		return ans;



		//char[] chars = str.toCharArray();
	}

}
//public static String uniqueChar(String str){
//	HashMap<Character,Boolean> map= new HashMap<>();
//    String ans="";
//    for(int i=0;i<str.length();i++){
//       char ch=str.charAt(i);
//        if(!map.containsKey(ch)){
//            map.put(ch,true);
//            ans+=ch;
//        }
//    }
//    return ans;
//}