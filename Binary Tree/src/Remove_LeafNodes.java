
public class Remove_LeafNodes {
	 public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){

	        if(root==null)
	            return null;

	        if(root.right==null && root.left==null)
	            return null;

	        root.left= removeAllLeaves(root.left);
	        root.right =   removeAllLeaves(root.right);


	        return root;


	    }

}
