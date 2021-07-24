import java.util.Queue;
import java.util.LinkedList;
public class Print_LEvel_wise {


		/*	Binary Tree Node class
		 * 
		 * class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;

			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		 */
		public static void printLevelWise(BinaryTreeNode<Integer> root) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Print output and don't return it.
			 * Taking input is handled automatically.
			 */

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
					} 
					else{
						System.out.print(front.data + ":");
						if(front.left!=null){
							System.out.print("L:"+front.left.data +",");
							pendingnodes.enqueue(front.left);
						}
						else{
							System.out.print("L:"+"-1"+",");
						}

						if(front.right!=null){
							System.out.print("R:"+front.right.data );
							pendingnodes.enqueue(front.right);

						}
						else{
							System.out.print("R:"+"-1");
						}
						System.out.println();

					}
				}
				catch  (QueueEmptyException e) {
					return ;
				}
			}
		}

	}


