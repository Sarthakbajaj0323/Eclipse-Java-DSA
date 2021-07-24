
public class Heigth_of_binary_tree {

	public static int height(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if (root==null)
			return 0;

		int left=height(root.left);
		int right=height(root.right);


		if(left>right)
			return left+1;
		else 
			return right+1;
	}
}
