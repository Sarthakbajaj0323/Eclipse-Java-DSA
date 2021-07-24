
public class Inorder_Postorder {
	 public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,int[] in){
	        return  helper(post,in,0,post.length-1,0,in.length-1);
	    }
	    private static BinaryTreeNode<Integer> helper( int[] post, int[] in,int postS, int postE ,int inS,int inE){
	        if(inS>inE||postS>postE){
	            return null;
	        }
	        int rootdata=post[postE];
	        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);

	        int rootInindex=-1;
	        for(int i=inS;i<=inE;i++){
	            if(in[i]==rootdata){
	                rootInindex=i;
	                break;
	            }
	        }
	        int leftInstart=inS;
	        int leftInend=rootInindex-1;
	        int leftpoststart=postS;
	        int leftpostend=leftInend-leftInstart+leftpoststart;
	        int rightInstart=rootInindex+1;
	        int rightInend=inE;
	        int rightpoststart=leftpostend+1;
	        int rightpostend=postE-1;

	        root.left=helper(post,in,leftpoststart,leftpostend,leftInstart,leftInend);
	        root.right=helper(post,in,rightpoststart,rightpostend,rightInstart,rightInend);

	        return root;



	    }
	}


