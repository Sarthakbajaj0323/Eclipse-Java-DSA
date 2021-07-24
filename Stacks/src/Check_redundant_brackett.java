import java.util.Stack;

import java.util.*;

public class Check_redundant_brackett {


	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
		Stack<Character> stack=new Stack<Character>();
		//Stack<string> numbers = new Stack<string>();
		for(int i=0;i<input.length();i++)
		{
			stack.push(input.charAt(i));  
		}
		int count=0;
		// boolean result=true;
		while(!stack.empty())
		{
			if(stack.pop()==')')
			{
				while(stack.peek()!='('  && !stack.empty() ){
					count++;
					stack.pop();
				}
				//  System.out.println(count);

				if(count==0)
					return true;
				else
					count=0;
				// continue;
			}
			//stack.pop();
		}


		return false;
	}
}

