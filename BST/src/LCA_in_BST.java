
public class LCA_in_BST {
	 public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
	        // Write your code here
	        if (root == null) {
	            return -1;
	        }
	        if (root.data == a || root.data == b) {
	            return root.data;
	        } 
	        int c = lcaInBST(root.left, a, b);
	        int d = lcaInBST(root.right, a, b);
	        if (c == -1 && d != -1) {
	            return d;
	        } else if (c != -1 && d == -1) {
	            return c;
	        } else if (c == -1 && d == -1) {
	            return -1;
	        } else {
	            return root.data;
	        }
	    }
//	  public static BinaryTreeNode<Integer> lcaInBSThelper(BinaryTreeNode <Integer> root , int a, int b){
//	        // Write your code here
//
//
//	        if (root == null) 
//	            return null;
//
//	        if (root.data == a || root.data == b)
//	            return root;
//
//	        if(root.data>a && root.data>b){
//	            return lcaInBSThelper(root.left,a,b);
//	        }
//	        else if(root.data<a &&root.data<b){
//	            return lcaInBSThelper(root.right,a,b);
//	        }
//	        else{
//	            BinaryTreeNode<Integer> left_lca = lcaInBSThelper(root.left, a, b);
//	            BinaryTreeNode<Integer> right_lca = lcaInBSThelper(root.right, a, b);
//	            if(left_lca !=null && right_lca!=null){
//	                return root;
//	            }
//	            if (left_lca!=null)
//	            {
//	                return left_lca ;
//	            } else{
//	                return right_lca;
//	            }
//	        }
//	    }
//	        public static int lcaInBST(BinaryTreeNode<Integer>root , int a, int b){
//	            BinaryTreeNode<Integer> node=lcaInBSThelper(root,a,b);
//	            if(node!=null){
//	                return node.data;
//	            }
//	            else{
//	                return -1  ;
//	            }
//	        }
}
