
public class Find_Range {
	  public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2){
	        if(root==null){
	            return ;
	        }
	        if(root.data>k1){
	            printNodeFromK1ToK2(root.left, k1, k2);
	        }
	        if(root.data>=k1 && root.data<=k2){
	            System.out.print(root.data+" ");
	        
	         }
	        if(root.data<k2){
	            printNodeFromK1ToK2(root.right, k1, k2);

	        }
	    }
}
