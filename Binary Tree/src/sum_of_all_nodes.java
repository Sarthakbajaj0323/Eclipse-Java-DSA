
public class sum_of_all_nodes {
public static int sum(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if(root==null){
            return 0;
        }
        int sum=0;
        sum+=root.data+sum(root.left)+sum(root.right);
        return sum;

}
}
/*public static int sum(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if(root==null){
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
}*/
	

