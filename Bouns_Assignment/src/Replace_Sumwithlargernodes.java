
import java.util.ArrayList;
public class Replace_Sumwithlargernodes {
	//Approach 1: time complexity O(n) we go in reverse inorder mannter ie right root left
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replaceWithLargerNodesSum(root,0);
	}	
	public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root, int sum){
		//Base Case
		if(root == null)
			return sum;
		//Recursive Case
		sum = replaceWithLargerNodesSum(root.right,sum);
		sum += root.data;
		root.data = sum;
		return replaceWithLargerNodesSum(root.left,sum);
	}
	// //Approach 2 : Inorder approach Time Complexity : O(n) space Complexity O(n)
	// public static void replaceWithLargerNodesSum_2(BinaryTreeNode<Integer>root){
	// 	if(root == null)
	// 		return;
	// 	ArrayList<BinaryTreeNode<Integer>> list = new ArrayList<>();
	// 	inorderList(root,list);
	// 	BinaryTreeNode<Integer> next = list.get(list.size()-1);
	// 	for(int i = list.size() - 2; i>=0; i--){
	// 		BinaryTreeNode<Integer> current = list.get(i);
	// 		current.data += next.data;
	// 		next = current;
	// 	}
	// }
	//Function to return the sorted list of the binaryTree
	public static void inorderList(BinaryTreeNode<Integer> root, ArrayList< BinaryTreeNode<Integer> >list){
		if(root == null)
			return;
		inorderList(root.left,list);
		list.add(root);
		inorderList(root.right,list);
	}

}

