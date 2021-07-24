
public class Construct_BSTformsortedarray {
	 public static BinaryTreeNode<Integer> helper(int [] arr,int si,int ei){
	        if(si>ei){
	            return null ;
	        }
	        int mid=(si+ei)/2;
	        BinaryTreeNode<Integer> node= new BinaryTreeNode<Integer>(arr[mid]);
	        
	        node.left=helper(arr, si,mid-1);
	        node.right=helper(arr, mid+1, ei);
	        
	        return node;
	    }
	    
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
			return helper(arr,0,arr.length-1);

		}
}
