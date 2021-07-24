import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Print_all_possible_substring {



	public static void printAllPossibleCodes(String input) {
		// Write your code here
		List<String> res = new ArrayList<>();
		res=decodeToAlphabet(input);

		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i));
		} 

	}

	private static List<String> decodeToAlphabet(String num) {
		List<String> res = new ArrayList<>();
		if (num == null || num.length() == 0) {
			return res;
		}
		dfs(num, 0, new StringBuilder(), res);
		return res;
	}

	private static void dfs(String num, int pos, StringBuilder path, List<String> res) {
		if (pos == num.length()) {
			res.add(path.toString());
			return;
		}
		int num1=  Integer.valueOf(num.substring(pos, pos + 1));
		path.append((char)('a' + num1 - 1));
		dfs(num, pos + 1, path, res);
		path.deleteCharAt(path.length() - 1);
		if (pos + 1 < num.length()) {
			int num2 = Integer.valueOf(num.substring(pos, pos + 2));
			if (10 <= num2 && num2 <= 26) {
				path.append((char)('a' + num2 - 1));
				dfs(num, pos + 2, path, res);
				path.deleteCharAt(path.length() - 1);
			}
		}
	}

}

