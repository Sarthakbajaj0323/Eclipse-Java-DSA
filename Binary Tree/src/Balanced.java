
public class Balanced {
	 public static  int height(BinaryTreeNode<Integer> root) 
	    { 
	        /* base case tree is empty */
	        if (root == null) 
	            return 0; 
	  
	        /* If tree is not empty then height = 1 + max of left 
	         height and right heights */
	        return 1 + Math.max(height(root.left), height(root.right)); 
	    } 
	    
	    
		
		public static boolean checkBalanced(BinaryTreeNode<Integer> root){
			
			
	         int lh; /* for height of left subtree */
	  
	        int rh; /* for height of right subtree */
	  
	        /* If tree is empty then return true */
	        if (root == null) 
	            return true; 
	  
	        /* Get the height of left and right sub trees */
	        lh = height(root.left); 
	        rh = height(root.right); 
	  
	        if (Math.abs(lh - rh) <= 1
	            && checkBalanced(root.left) 
	            && checkBalanced(root.right)) 
	            return true; 
	  
	        /* If we reach here then tree is not height-balanced */
	        return false; 
	        
	        
	        
			
		}
}
