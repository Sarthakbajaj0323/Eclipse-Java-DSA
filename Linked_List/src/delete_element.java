
public class delete_element {
	

		public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
			
	        if(head==null){
	            return head;
	        }
	        if(pos==0){
	            return head.next;
	        }
	        
	        int count=0;
	        LinkedListNode<Integer> currhead=head;
	        while(currhead!=null && count<(pos-1)){
	            currhead=currhead.next;
	            count++;
	        }
	        if(currhead==null || currhead.next==null){
	            return head;
	        }
	        currhead.next=currhead.next.next;
	        
	        return head;
	        
		}
	}
