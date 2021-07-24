
public class Find_NODE {
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(root==null){
            return false;
        }
        // boolean ans=false;
        if(root.data==x){
            return true;
        }
        boolean ans1=isNodePresent(root.left,x);
        // if(ans)
        //     return ans;
        boolean ans2=isNodePresent(root.right,x);
        if(ans1==true||ans2==true)
            return true;
        else
            return false;
    }
	
	
	
}
