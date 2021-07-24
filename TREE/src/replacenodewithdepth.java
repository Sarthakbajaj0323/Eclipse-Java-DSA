import java.util.Queue;
import java.util.LinkedList;

public class replacenodewithdepth {



	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
			T data;
			ArrayList<TreeNode<T>> children;
			TreeNode(T data){
				this.data = data;
				children = new ArrayList<TreeNode<T>>();
			}
		}*/

//	static int a=0;
//
//	public static void replaceWithDepthValue(TreeNode<Integer> root){
//
//
//
//
//		Queue<TreeNode<Integer>> queue = new LinkedList<>();
//		//added 1st level here 
//		queue.add(root);
//		queue.add(null);
//
//		while(!queue.isEmpty())
//		{    
//			TreeNode<Integer> frontNode = queue.remove();
//
//			if(frontNode == null)
//			{
//				if(queue.isEmpty())
//				{
//					break;
//				}
//
//				a++;
//				queue.add(null);
//			}
//			else
//			{
//				frontNode.data=a;
//				for(int i=0;i<frontNode.children.size();i++)
//				{
//					queue.add(frontNode.children.get(i));
//				}
//
//
//			}
//
//		}
//
//
//	}


	 public static void replaceWithDepthValue(TreeNode<Integer> root){

	        if(root==null){
	            return;
	        }
	        replaceWithDepthValue( root , 0);
	    }

	    public static void replaceWithDepthValue(TreeNode<Integer> root , int depth){
	        root.data=depth;
	        for(int i =0; i<root.children.size();i++){
	            replaceWithDepthValue(root.children.get(i), depth+1);
	        }
	    }
}

