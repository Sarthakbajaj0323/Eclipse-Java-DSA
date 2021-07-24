import java.util.ArrayList;
public class Reverse_LL {
    public static int LengthIterative(LinkedListNode<Integer> head){
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
         int length=LengthIterative(root);
       ArrayList<Integer> list1=new ArrayList<Integer>(length);
       for(int i=0;i<length;i++)
       {
           list1.add(root.data);
           root=root.next;
       }
        for(int i=length-1;i>=0;i--)
       {
           System.out.print(list1.get(i)+" ");
           
       }
       //ArrayList<String> list=new ArrayList<String>()
	}
}
