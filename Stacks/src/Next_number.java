
public class Next_number {

	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		LinkedListNode<Integer> prev=null;
		LinkedListNode<Integer> curr=head;
		while(curr!=null) {
			LinkedListNode<Integer> temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
	public static LinkedListNode<Integer> nextlargernumber(LinkedListNode<Integer> head){
		head=reverse(head);
		int carry=1, num;
	    LinkedListNode<Integer>ptr=head , prev=null;
	    while(ptr!=null){
	    	num=((ptr.data)+carry)%10;
	    	carry=((ptr.data)+carry)/10;
	    	ptr.data=num;
	    	prev=ptr;
	    	ptr=ptr.next;
	    }
	    if(carry==1) {
	    	LinkedListNode<Integer>tail=new LinkedListNode<Integer>(carry);
	    	prev.next=tail;
	    }
	    return reverse(head);
	}
}
