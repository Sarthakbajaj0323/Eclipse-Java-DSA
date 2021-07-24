import java.util.Queue;
import java.util.LinkedList;
public class QueueCollections {

	public static void main(String[] args) {

		Queue<Integer> queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.remove(10);
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
	}

}
