import java.util.Stack;

public class Minimum_bracket_reversal {


	// Function returns -1 if brackets can't be balanced
	public static int countBracketReversals(String input){

		// Write your code here

		if(input.length()==0){
			return 0;
		}
		if(input.length()%2!=0){
			return -1;
		}

		Stack<Character> s=new Stack<>(); 
		for (int i=0;i<input.length();i++){
			char elem=input.charAt(i);
			if(elem=='{'){
				s.push(elem);

			}
			else{
				if(!s.isEmpty() && s.peek()=='{'){
					s.pop();
				}
				else{
					s.push(elem);
				}
			}

		}
		int count=0;
		while(!s.isEmpty()){
			char c1=s.pop();
			char c2=s.pop();

			if(c1!=c2){
				count+=2;
			}
			else{
				count++;
			}
		}
		return count;
	}



}


