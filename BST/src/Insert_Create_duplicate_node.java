
public class Insert_Create_duplicate_node {
	 public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
	        // Write your code here
	        if(root==null){
	            return;
	        }
	        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
	        BinaryTreeNode<Integer> rootLeft = root.left;
	        root.left = newNode;
	        newNode.left = rootLeft;
	        insertDuplicateNode(rootLeft);
	        insertDuplicateNode(root.right);
	    }
}
