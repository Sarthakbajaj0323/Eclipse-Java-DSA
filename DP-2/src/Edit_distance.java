
public class Edit_distance {
	public static int editDistance(String s1, String s2){		
		if(s1.length() == 0 && s2.length() != 0)
			return s2.length();
		if(s1.length() != 0 && s2.length() == 0)
			return s1.length();
		if(s1.length() == 0 && s2.length() == 0)
			return 0;

		int op1 = 0, op2 = 0, op3 = 0;
		if(s1.charAt(0) == s2.charAt(0)) {
			return  editDistance(s1.substring(1), s2.substring(1));
		} else {
			op1 = editDistance(s1, s2.substring(1));
			op2 = editDistance(s1.substring(1), s2);
			op3 = editDistance(s1.substring(1), s2.substring(1));
			return 1+ Math.min(op1, Math.min(op2, op3));
		}
	}
	public static void main(String[] args) {
		String s = "adef";
		String t = "gbde";
		System.out.println(editDistance(s, t));
}
}
