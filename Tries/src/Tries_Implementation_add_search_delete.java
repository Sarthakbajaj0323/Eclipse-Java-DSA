class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childcount;

	public TrieNode(char data) {
		this.data=data;
		isTerminating=false;
		children=new TrieNode[26];
		childcount=0;
	}
}
public class Tries_Implementation_add_search_delete {

	private TrieNode root;

	public Tries_Implementation_add_search_delete() {
		root=new TrieNode('\0');
	}

	public void remove(String word) {
		remove(root,word);
	}
	private void remove(TrieNode root, String word) {
	if(word.length()==0){
		root.isTerminating=false;
		return;
	}
	int childindex=word.charAt(0)-'a';
	TrieNode child=root.children[childindex];
	if (child==null) {
		return;
	}
	 remove(child, word.substring(1));
	 //we can remove the child node if it is non terminating and its no of children are 0

	 if(!child.isTerminating && child.childcount==0){
		 root.children[childindex]=null;
		 child=null;
		 root.childcount--;
	 }
	 //	 if(!child.isTerminating) {
//		 int numchild=0;
//		 for(int i=0;i<26;i++) {
//			 if(child.children!=null) {
//				 numchild++;
//			 }
//		 }
//		 if(numchild==0) {
//			 //we can delete the child
//			 root.children[childindex]=null;
//			 child=null;
//		 }
//	 }
	}

	public boolean search(String word) {
		return search(root,word);
	}

	private boolean search(TrieNode root, String word) {
		if (word.length()==0) {
			return root.isTerminating;
		}
		int childindex=word.charAt(0)-'a';
		TrieNode child=root.children[childindex];
		if(child==null) {
			return false;
		}
		return search(child, word.substring(1));
	}


	public void add(TrieNode root, String word) {
		if(word.length()==0) {
			root.isTerminating=true;
			return;
		}
		int childindex=word.charAt(0)-'a';
		TrieNode child=root.children[childindex];
		if(child==null) {
			child=new TrieNode(word.charAt(0));
			root.children[childindex]=child;
			root.childcount++;
		}
		add(child, word.substring(1));
	}
	public void add(String word) {
		add(root,word);
	}

}
