
public class max_sum_node {

	static class MaxNodePair<T>{
		TreeNode<T> node;
		int sum;
	}
	public static TreeNode<Integer> maxsumnode(TreeNode<Integer> root){
		return maxnodenodehelper(root).node;
	}
	public static MaxNodePair<Integer> maxnodenodehelper(TreeNode<Integer> root) {

		if(root==null) {
			MaxNodePair<Integer> pair=new MaxNodePair<>();
			pair.node=null;
			pair.sum=Integer.MIN_VALUE;
			return pair;
		}
		int sum=root.data;
		for(int i=0;i<root.children.size();i++) {
			sum+=root.children.get(i);
		}
	}
	
}
