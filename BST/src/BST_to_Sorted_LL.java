class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class BST_to_Sorted_LL {
	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		 LinkedListNode<Integer> head=new LinkedListNode<Integer>(root.data);
       
       if(root.left==null&&root.right==null)
       {
           return head;
       }
       
       else if(root.left!=null&&root.right!=null)
       {
           LinkedListNode<Integer> temp=BSTToSortedLL(root.left);
           LinkedListNode<Integer> tempp=temp;
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           temp.next=head;
           head.next=BSTToSortedLL(root.right);
           return tempp;
       }
       
       else if(root.left!=null)
       {
           LinkedListNode<Integer> temp=BSTToSortedLL(root.left);
           LinkedListNode<Integer> tempp=temp;
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           temp.next=head;
           return tempp;
       }
       else
       {
           head.next=BSTToSortedLL(root.right);
           return head;
       }
}
}