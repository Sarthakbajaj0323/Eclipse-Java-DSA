import java.util.Queue;
public class Level_order_Traversal {
public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		// Write your code here

     	if (root==null){
				return ;
			}
			QueueUsingLL<BinaryTreeNode<Integer>> pendingnodes=new  QueueUsingLL<BinaryTreeNode<Integer>>();
			BinaryTreeNode<Integer> nullnode=new BinaryTreeNode<Integer> (Integer.MIN_VALUE);
			pendingnodes.enqueue(root);
			pendingnodes.enqueue(nullnode);
			while(!pendingnodes.isEmpty()){

				try{
					BinaryTreeNode <Integer> front=pendingnodes.dequeue();
					if(front==nullnode){
						if(pendingnodes.isEmpty()){
							break;
						}

						pendingnodes.enqueue(nullnode);
						System.out.println();
                    } 
					else{
						System.out.print(front.data+" " );
						if(front.left!=null){
							
							pendingnodes.enqueue(front.left);
						}
						if(front.right!=null){
							pendingnodes.enqueue(front.right);
						}
					

					}
				}
				catch  (QueueEmptyException e) {
					return ;
				}
            }
    }

}
