
public class Reverse_Queue {

		public static void reverseQueue(Queue<Integer> q) {
			// Write your code here

	        
	        if(q.size()==0)
	            return;
	        int temp=q.dequeue();
	        reverseQueue(q);
	        q.enqueue(temp);
	        
		
	}
}
