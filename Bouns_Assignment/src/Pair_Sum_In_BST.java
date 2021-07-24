import java.util.*;

public class Pair_Sum_In_BST {

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	public static void pairSum(ArrayList<Integer> arr, int num) 
	{

		int i = 0, j = arr.size() - 1; 
		int count = 0;

		while (i != j && j > i && i < arr.size() - 1 && j > 0)  {
			if ((arr.get(i) + arr.get(j)) > num )  {
				j --;
			}

			else if ((arr.get(j) + arr.get(i)) < num)  { 
				i ++;
			}

			else {
				System.out.println(arr.get(i) + " " + arr.get(j));
				if(arr.get(j - 1) == arr.get(j) && i != j - 1){
					j --;
					count ++;
				} 
				else {
					if(arr.get(i) == arr.get(i + 1)) {
						j = j + count;
						count = 0;
					}
					else
						j --;
					i ++;
				}
			} 
		}
	}


	public static ArrayList<Integer> convertArray(BinaryTreeNode<Integer> root) {
		if(root == null) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			return arr;
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> smallAnsLeft = convertArray(root.left);
		ans.addAll(smallAnsLeft);
		ans.add(root.data);
		ArrayList<Integer> smallAnsRight = convertArray(root.right);
		ans.addAll(smallAnsRight);
		return ans;
	}


	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here


		ArrayList<Integer> arr = convertArray(root);
		pairSum(arr, s);
	}
}
