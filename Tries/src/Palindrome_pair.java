import java.util.*;



public class Palindrome_pair {
	class TrieNode{

		char data;
		boolean isTerminating;
		TrieNode children[];
		int childCount;

		public TrieNode(char data) {
			this.data = data;
			isTerminating = false;
			children = new TrieNode[26];
			childCount = 0;
		}
	}
	public class Trie {

		private static TrieNode root;
		public int count;
		public Trie() {
			root = new TrieNode('\0');
		}

		private static void add(TrieNode root, String word){
			if(word.length() == 0){
				if (!root.isTerminating) {
					root.isTerminating = true;
					return;
				}
			}		
			int childIndex = word.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if(child == null){
				child = new TrieNode(word.charAt(0));
				root.children[childIndex] = child;
				root.childCount++;
			}
			add(child, word.substring(1));

		}

		public static void add(String word){
			add(root, word);
		}

		public static boolean search(TrieNode root,String word){
			if(word.length() == 0){
				return true;
			}		
			int childIndex = word.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if(child == null){
				return false;
			}
			return search(child, word.substring(1));
		}
		static boolean isPalindrome(String str) 
		{ 
			int len = str.length(); 

			// compare each character from starting 
			// with its corresponding character from last 
			for (int i = 0; i < len/2; i++ ) 
				if (str.charAt(i) != str.charAt(len-i-1)) 
					return false; 

			return true; 
		} 

		public boolean isPalindromePair(ArrayList<String> vect) {
			// Complete this function
			// Return the output as specified in question
			String input1,p="";
			for(int i =0;i<vect.size();i++){
				if(!search(root,vect.get(i)))
					add(vect.get(i));
			}
			for(int i =0;i<vect.size();i++){
				p="";
				input1 = vect.get(i);
				for(int k =0;k<input1.length();k++){
					p=input1.charAt(k)+p;
				}
				// System.out.println(p);
				if(search(root,p)){
					return true;
				}
			}		// Complete this function
			// Return the output as specified in question

			for (int i = 0; i< vect.size()-1; i++) 
			{ 
				for (int j = i+1; j< vect.size() ; j++) 
				{ 
					String check_str = ""; 

					// concatenate both strings 
					check_str = check_str + vect.get(i) + vect.get(j); 

					// check if the concatenated string is 
					// palindrome 
					if (isPalindrome(check_str)) 
						return true; 

					check_str = vect.get(j) + vect.get(i); 

					// check if the concatenated string is 
					// palindrome 
					if (isPalindrome(check_str)) 
						return true; 
				} 
			} 
			return false;
		}

	}
}
