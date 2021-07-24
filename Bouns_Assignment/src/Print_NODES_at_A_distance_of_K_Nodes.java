

import java.util.Queue;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

public class Print_NODES_at_A_distance_of_K_Nodes {

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		// Write your code here

		if(root == null) return;

		HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> parentMap = new HashMap<>();
		fillMap(parentMap, root, null);

		BinaryTreeNode<Integer> target = getTarget(root, node);


		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		Set<BinaryTreeNode<Integer>> seen = new HashSet<>();

		q.add(null);
		q.add(target);


		seen.add(target);
		seen.add(null);

		int distance = 0;

		while(!q.isEmpty()){

			BinaryTreeNode<Integer> curr = q.poll();

			if(curr == null) {

				if(distance == k){
					for(BinaryTreeNode<Integer> n : q){
						System.out.println(n.data);
					}
					return;
				}
				q.add(null);
				distance++;
			} else{

				if(!seen.contains(curr.left)){
					q.add(curr.left);
					seen.add(curr.left);
				}
				if(!seen.contains(curr.right)){
					q.add(curr.right);
					seen.add(curr.right);
				}

				BinaryTreeNode<Integer> parent = parentMap.get(curr);

				if(!seen.contains(parent)){
					q.add(parent);
					seen.add(parent);
				}
			}
		}

	}

	static void fillMap(HashMap<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> map, BinaryTreeNode<Integer> node, BinaryTreeNode<Integer> parent){
		if(node == null ) return;

		map.put(node,parent);
		fillMap(map, node.left, node);
		fillMap(map, node.right, node);
	}

	static BinaryTreeNode<Integer> getTarget(BinaryTreeNode<Integer> root, int node){
		if(root == null) return root;

		if(root.data == node) return root;

		BinaryTreeNode<Integer> left = getTarget(root.left, node);
		BinaryTreeNode<Integer> right = getTarget(root.right, node);

		return (left == null ) ? right : left;
	} 
}
