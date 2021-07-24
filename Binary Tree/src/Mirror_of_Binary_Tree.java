
public class Mirror_of_Binary_Tree {
	public static void mirror(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        if (root==null)
            return;
        
        
        BinaryTreeNode<Integer> temp=root.right;
        root.right=root.left;
        root.left=temp;
        
        mirror(root.left);
        mirror(root.right);
       


	}
}
