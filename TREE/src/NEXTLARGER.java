
public class NEXTLARGER {
public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
        if(root==null){
            return null;
        }
        TreeNode<Integer> Nextlarge=null;
        if(root.data>n){
            Nextlarge=root;
        }
        for(int i=0 ; i<root.children.size();i++){
            TreeNode<Integer>  childnextlarge=findNextLargerNode(root.children.get(i), n);
            if(childnextlarge!=null){
                if(Nextlarge==null || Nextlarge.data>childnextlarge.data){
                    Nextlarge=childnextlarge;
                }
            }
        }
        return Nextlarge;
	}

}
