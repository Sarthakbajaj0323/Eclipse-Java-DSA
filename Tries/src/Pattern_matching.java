import java.util.ArrayList;


public class Pattern_matching {
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
	    private TrieNode root;

	    public Trie() {
	        root = new TrieNode('\0');
	    }

	    private void add(TrieNode root, String word){
	        if(word.length() == 0){
	            root.isTerminating = true;
	            return;
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
	    public boolean search(String word){
	        return search(root,word);
	    }
	    
	    public boolean search(TrieNode root ,String word){
	        if(word.length()==0){
	            return true;
	            }
	        int childindex=word.charAt(0)-'a';
	        TrieNode child=root.children[childindex];
	        if(child==null){
	            return false;
	        }
	        return search(child,word.substring(1));
	    }

	    public void add(String word){
	        add(root, word);
	    }


	    public boolean patternMatching(ArrayList<String> input, String pattern) {
	        for(int i=0;i<input.size();i++){
	            String word=input.get(i);
	            for(int j=0;j<word.length();j++){
	                add(word.substring(j));
	            }
	        }
	        return search(pattern);

	    }
	}
	}

