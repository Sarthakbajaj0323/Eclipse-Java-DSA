
public class reverse_ll_best_method {

	public static Node<Integer> reversell(Node<Integer> head){
		if(head==null ||head.next==null){
			return head;
		}
		
		Node<Integer> reversedTail=head.next;
		Node<Integer>smallhead=reversell(head.next);
		reversedTail.next=head;
		head.next=null;
		
		return smallhead;
	}
}
