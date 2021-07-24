
public class insertion_LL_recursive {

	public static Node<Integer> Insert(Node<Integer > head, int pos ,int elem){
		if(pos==0) {
			Node<Integer>newNode=new Node<Integer>(elem);
			newNode.next=head;
			return head;
			
		}
		if (head==null) {
			return head;
		}
		head.next=Insert(head,pos-1,elem);
		return head;
	}
	public static void main(String[]args) {
	Node<Integer>head=takeinput(); //because i have not made the input function in this class
	head=Insert(head,4,10);
	print(head);//because i have not made the print function in this class
	}
}
