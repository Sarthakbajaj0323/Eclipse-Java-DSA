
public class reverse_ll_iterative {
	public static Node<Integer> reverse_I(Node<Integer> head) {

		Node<Integer> curr =head;

		Node<Integer>  prev=null;
		Node<Integer> temp;

		while(curr!=null)
		{
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}

		return prev;
	}

}
