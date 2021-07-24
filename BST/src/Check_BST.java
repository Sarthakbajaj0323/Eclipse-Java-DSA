
public class Check_BST {
	public static boolean isBST(BinaryTreeNode<Integer> root,int min,int max) {
		if(root==null){
            return true;
        }
        if(root.data>min && root.data<max){
            boolean ans1=isBST(root.left,min,root.data);
            boolean ans2=isBST(root.right,root.data,max);
            return ans1&&ans2;
        }
        else{
            return false;
            }
	}
    public static boolean isBST(BinaryTreeNode<Integer> root){
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
}
