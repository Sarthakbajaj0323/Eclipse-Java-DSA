
public class Check_BST3 {
	public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		boolean isLeftOk = isBST3(root.left, min, root.data - 1);
		boolean isRightOk = isBST3(root.right, root.data, max);
		return isLeftOk && isRightOk;
	}
}
