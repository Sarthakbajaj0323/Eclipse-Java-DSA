import java.util.Stack;
	
public class Balanced_Parenthesis {
	

		public static boolean checkBalanced(String exp) {
			// Write your code here

	        Stack <Character> mystack=new Stack<Character>();
	        for(int i=0; i<exp.length();i++){
	            if(exp.charAt(i)=='(' || exp.charAt(i)=='[' || exp.charAt(i)=='{'){
	                mystack.push(exp.charAt(i));
	            }
	            else if(exp.charAt(i)==')' || exp.charAt(i)==']' || exp.charAt(i)=='}'){
	                if(mystack.isEmpty()){
	                    return false;
	                }
	                char ch=mystack.pop();
	                if(exp.charAt(i)==')'  &&  ch=='('){
	                    continue;
	                }
	                else if (exp.charAt(i)==']'  &&  ch=='['){
	                    continue;
	                }
	                else if (exp.charAt(i)=='}'  &&  ch=='{'){
	                    continue;
	                }
	                else{
	                    return false;
	                }
	            }
	        }
	        if (mystack.isEmpty()){
	            return true;
	        }
	        else{
	            return false;
	        }
	        
		}
	}

