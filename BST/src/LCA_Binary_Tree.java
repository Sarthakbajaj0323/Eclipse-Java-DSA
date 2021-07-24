
public class LCA_Binary_Tree {
	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
		// Write your code here

        
        if (root == null) 
        {
			return -1;
		}
        
		if (root.data == a || root.data == b)
        {
			return root.data;
		} 
        
		int c = lcaBinaryTree(root.left, a, b);
		int d = lcaBinaryTree(root.right, a, b);
		
        if (c == -1 && d != -1)
        {
			return d;
		} 
        else if (c != -1 && d == -1) 
        {
			return c;
		} 
        else if (c == -1 && d == -1)
        {
			return -1;
		} 
        else 
        {
			return root.data;
		}
	}
//	public static BinaryTreeNode<Integer> lcaBinaryTreehelper(BinaryTreeNode <Integer> root , int a, int b){
//        // Write your code here
//
//
//        if (root == null) 
//        {
//            return null;
//        }
//
//        if (root.data == a || root.data == b)
//        {
//            return root;
//        } 
//
//        BinaryTreeNode<Integer> left_lca = lcaBinaryTreehelper(root.left, a, b);
//        BinaryTreeNode<Integer> right_lca = lcaBinaryTreehelper(root.right, a, b);
//        if(left_lca !=null && right_lca!=null){
//            return root;
//        }
//        if (left_lca!=null)
//        {
//            return left_lca ;
//        } 
//        return right_lca;
//    }
//    public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
//        BinaryTreeNode<Integer> node=lcaBinaryTreehelper(root,a,b);
//        if(node!=null){
//            return node.data;
//        }
//        else{
//            return -1  ;
//        }
//    }

}
