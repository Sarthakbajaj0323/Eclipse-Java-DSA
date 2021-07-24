
public class K_REVERSE_RECURSIVE {

	  public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {

	        LinkedListNode<Integer> current =head;

	        LinkedListNode<Integer>  prev=null;
	        LinkedListNode<Integer> next=null;
	        int count = 0; 

	        /* Reverse first k nodes of linked list */
	        while (count < k && current != null)  
	        { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	            count++; 
	        } 

	        /* next is now a pointer to (k+1)th node  
	          Recursively call for the list starting from current. 
	          And make rest of the list as next of first node */
	        if (next != null)  
	            head.next = kReverse(next, k); 

	        // prev is now head of input list 
	        return prev; 

	    }
}
