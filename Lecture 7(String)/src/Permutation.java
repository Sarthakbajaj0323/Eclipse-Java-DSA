
public class Permutation {

	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
       if (input1.length() != input2.length()) {
			return false;
		}

		int[] arr = new int[256]; // assume character is ASCII
		for (int i=0; i< input1.length(); i++) {
			char value = input1.charAt(i);
			arr[value] ++;
		}

		for (int i=0; i< input2.length(); i++) {
			int value = input2.charAt(i);
			if (--arr[value] < 0) {
				return false;
			}
		}
		return true;
	
	}
}
