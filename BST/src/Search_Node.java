
public class Search_Node {
	 public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k){
	        /* Your class should be named Solution
			* Don't write main().
			* Don't read input, it is passed as function argument.
			* Return output and don't print it.
			* Taking input and printing output is handled automatically.
			*/
	    //   BinarySearchNode<Integer> temp=null;
	        
	        if(root==null){
	            return null;
	        }
	        if(root.data==k){
	            return root;
	        }
	        if(root.data>k){
	            return searchInBST(root.left,k);
	        }
	        else{
	            return searchInBST(root.right,k);
	        }
	    }
}
