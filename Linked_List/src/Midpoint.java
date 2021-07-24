
public class Midpoint {
	public static int printMiddel(LinkedListNode<Integer> head) {
        if(head.next==null)
          return head.data;
      
      LinkedListNode<Integer> slow=head;
      
      LinkedListNode<Integer> fast=head;
      
      while(fast.next.next!=null && fast.next!=null)
      {slow=slow.next;
      fast=fast.next.next;
      }
      return slow.data;
	}
}
