import java.util.Stack;

public class Reverse_stack {



	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {

		if(s1.size()==0||s1.size()==1) {
			return;
		}
		
		int temp=s1.pop();
		reverseStack(s1,s2);
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
			
		}
		s1.push(temp);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
}
