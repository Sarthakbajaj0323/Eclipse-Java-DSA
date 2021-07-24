import java.util.ArrayList;
public class Palindrome_LL {
	public static int LengthIterative(LinkedListNode<Integer> head){
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
    
    
	public static boolean isPalindrome(LinkedListNode<Integer> root) {
        
         int length=LengthIterative(root);
        ArrayList<Integer> list1=new ArrayList<Integer>(length);
        for(int i=0;i<length;i++)
        {
            list1.add(root.data);
            root=root.next;
        }
        
        int tail=length-1;
         int i=0;
        boolean isPalindrome=true;
        while(i<=tail)
        {
            if(list1.get(i)!=list1.get(tail))
            {
                isPalindrome=false;
            	return false;
            }
            i++;
            tail--;
        }
        
        return isPalindrome;
    }
}
