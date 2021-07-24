
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
public class Largest_BST {
	static class  Value{
		int min;
		int max;
		boolean present;
		int h;
	}
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
			return largestBSTSubtree_help(root).h;
		}
		public static Value largestBSTSubtree_help(BinaryTreeNode<Integer>root){
			Value v = new Value();
			if(root == null){
				v.h = 0;
				v.present = true;
				v.min = Integer.MAX_VALUE;
				v.max = Integer.MIN_VALUE; 
				return v;
			}
			//Rec Case
			Value vLeft = largestBSTSubtree_help(root.left);
			Value vRight = largestBSTSubtree_help(root.right);
			//Small Calculation
			v.h = Math.max(vLeft.h,vRight.h);
			v.min = Math.min(root.data,Math.min(vLeft.min,vRight.min));
		    v.max = Math.max(root.data,Math.max(vLeft.max,vRight.max));
			if(vLeft.present && vRight.present){
				v.present = true;
				if(root.data > vLeft.max  && root.data < vRight.min){
					v.h ++;
					v.present = true;
				}		
			    return v;
			}
			v.present = false;
			return v;

		}
}
