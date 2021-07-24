
public class eliminate_duplicate {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head)
    {
        
        if(head==null || head.next==null)
            return head;
        
        LinkedListNode<Integer> pivot1=head;
        
       
        
        while(pivot1.next!=null)
        {	
            if(pivot1.data.equals(pivot1.next.data))
            {
                pivot1.next=pivot1.next.next;
                
            }
            else{
            pivot1=pivot1.next;
            
           
            }
        }
        
        return head;
        
    }

}
