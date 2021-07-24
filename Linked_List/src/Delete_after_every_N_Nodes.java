
public class Delete_after_every_N_Nodes {

/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {

        if(M==0)
            return null;


        LinkedListNode<Integer> curr = head, rem;
        int count;
        //Move M nodes and delete N nodes
        while(curr!=null)
        {
            for (count = 1; count<M && curr!= null; count++)
            {
                curr = curr.next;
            }
            if (curr == null)
            {
                return head;
            }
            rem = curr.next;
            for(count = 1; count<=N && rem!= null; count++)
            {
               
                rem = rem.next;

            }
            //link to remaining nodes
            //continue iteration for the remaining nodes
            curr.next = rem;
            curr = rem;
        }
        return head;
    }

}

