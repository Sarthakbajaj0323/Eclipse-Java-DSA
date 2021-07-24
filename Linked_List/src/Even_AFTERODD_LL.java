
public class Even_AFTERODD_LL {


/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}



}
* */
    public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {

        if(head==null){
            return head;
        }
        LinkedListNode<Integer> oddhead = null, oddtail = null;
        LinkedListNode<Integer> evenhead = null, eventail = null;

        while (head != null)
        {
            if (head.data %2 == 0) {
                if(evenhead==null){
                    evenhead=head;
                    eventail=head;
                }

                else {
                    eventail.next=head;
                    eventail=eventail.next;
                }
            }
            else{
                if(oddhead==null){
                    oddhead=head;
                    oddtail=head;
                }

                else {
                    oddtail.next=head;
                    oddtail=oddtail.next;
                }
            }
            head=head.next;
        }
        if(oddhead==null){
            return evenhead;
        }
        else{
            oddtail.next=evenhead;
        }
        if(evenhead!=null){
            eventail.next=null;
        }
        return oddhead;
    }
}

