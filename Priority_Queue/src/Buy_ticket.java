import java.util.*;
public class Buy_ticket {
	 public static int buyTicket(int input[], int k) {
	        int timer = 0;
	        Queue<Integer> queue = new LinkedList<>();
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        for (int i=0;i<input.length;i++){
	            queue.add(i);
	            pq.add(input[i]);
	        }
	        while (!queue.isEmpty()){
	            if (input[queue.peek()] < pq.peek()){
	                queue.add(queue.poll());
	            }else{
	                int temp = queue.poll();
	                pq.remove();
	                timer++;
	                if (temp == k){
	                    return timer;
	                }
	            }
	        }
	        return timer;

	    }
}
