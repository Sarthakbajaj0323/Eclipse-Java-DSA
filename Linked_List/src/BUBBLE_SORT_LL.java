
public class BUBBLE_SORT_LL {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		//Write your code here
        
        
      LinkedListNode<Integer> current = head, index = null;  
        int temp;  
          
        if(head == null) {  
            return head;  
        }  
        else 
        {  
            while(current != null) 
            {  
                //Node index will point to node next to current  
                index = current.next;  
                  
               	 while(index != null) 
                 {  
                    //If current node's data is greater than index's node data, swap the data between them  
                    if(current.data > index.data)
                    {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
               	 }  
               	 current = current.next;  
            }  
            
        } 
        return head;
        
	}
}


//private static int Length(LinkedListNode<Integer> head){
//    int count=0;
//    while(head!=null){
//        head=head.next;
//        count++;
//    }
//    return count;
//}
//
//public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
//{
//    int n=Length(head);
//    for(int i=0; i<n-1; i++){
//        LinkedListNode<Integer> prev=null;
//        LinkedListNode<Integer> curr=head;
//
//        for(int j=0;j<n-i-1; j++){
//            if(curr.data<=curr.next.data){
//                prev=curr;
//                curr=curr.next;
//            }
//            else{
//                if(prev==null){
//                LinkedListNode<Integer> next=curr.next;
//                head=head.next;
//                curr.next=next.next;
//                next.next=curr;
//                prev=next;
//            }
//            else{  
//                LinkedListNode<Integer> next=curr.next;
//                prev.next=next;
//                curr.next=next.next;
//                next.next=curr;
//                prev=next;
//
//            }
//        }
//    }
//}
//return head;
//}
