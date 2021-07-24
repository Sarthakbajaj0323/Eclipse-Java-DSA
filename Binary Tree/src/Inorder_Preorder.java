
public class Inorder_Preorder {
	  public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,	int[] in){

	        // Write your code here

	        return helper (pre,in,0,pre.length-1,0,in.length-1);
	    }

	    private static BinaryTreeNode<Integer> helper( int[] pre, int[] in,int preS, int preE ,int inS,int inE){

	        //base condition
	        if (preS > preE|| inS > inE) 
	            return null;

	        //get the root node with curr preorder element
	        int rootdata=pre[preS];
	        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);

	        int  rootInindex=-1;
	        for(int i=inS;i<=inE;i++){
	            if(in[i]==rootdata){
	                rootInindex=i;
	                break;
	            }
	        }
	        int leftInstart=inS;
	        int leftInend=rootInindex-1;
	        int leftprestart=preS+1;
	        int leftpreend=leftInend-leftInstart+leftprestart;
	        int rightInstart=rootInindex+1;
	        int rightInend=inE;
	        int rightprestart=leftpreend+1;
	        int rightpreend=preE;
	        
	        root.left=helper(pre,in ,leftprestart,leftpreend,leftInstart,leftInend);
	        root.right=helper(pre, in, rightprestart,rightpreend,rightInstart,rightInend);
	        return root;



	    }
}
