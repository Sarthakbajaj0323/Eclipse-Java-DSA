
public class identical_structure {
	 public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

	        // Write your code here
	        if (root1==null && root2==null){
	            return true;
	        }

	        if (root1==null || root2==null){
	            return false;
	        }
	        if(!root1.data.equals(root2.data)){
	            return false;
	        }

	        if(root1.data != root2.data){
	            return false;
	        }
	        for(int i=0;i<root1.children.size();i++){
	            boolean ans=(!checkIdentical(root1.children.get(i), root2.children.get(i)));
	            if(ans){
	                return false;
	            }
	        }
	        return true;
	    }
}
//public static int countLeafNodes(TreeNode<Integer> root){
//    /* Your class should be named Solution.
//	 * Don't write main() function.
//	 * Don't read input, it is passed as function argument.
//	 * Print output as specified in the question
//	 */
//    int leaf = 0;
//
//    if (root == null )
//    {
//        return 0;
//    }
//
//
//    if (root.children.size() == 0)
//    {
//        return 1;
//    }
//
//
//
//    for (TreeNode<Integer> child : root.children) 
//    {
//        leaf += countLeafNodes(child);
//    }
//
//    return leaf ;
//
//
//}
//
//
//public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
//
//    // Write your code here
//
//    int a=countLeafNodes(root1),b=countLeafNodes(root2);
//    if(a==b){
//        return true;
//    }
//    else{
//        return   false;
//    }
//
//
//}