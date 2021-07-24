import java.util.*;
public class Running_Median {
	 public static void findMedian(int arr[]) {
	        int n= arr.length;

	        PriorityQueue<Integer> lowerhalf = new PriorityQueue<>(new Comparator<Integer>() {

	            public int compare(Integer first, Integer second) {

	                return (second - first);
	            }
	        });
	        PriorityQueue<Integer> higherhalf = new PriorityQueue<>();

	        int median;

	        for(int size = 1; size <= n; size++) { 
	            if(!lowerhalf.isEmpty() && lowerhalf.peek() > arr[size-1]) {
	                lowerhalf.add(arr[size - 1]);

	                if(lowerhalf.size() > higherhalf.size() + 1){
	                    higherhalf.add(lowerhalf.poll());

	                }

	            } else {

	                higherhalf.add(arr[size - 1]);

	                if(higherhalf.size() > lowerhalf.size() + 1) { 
	                    lowerhalf.add(higherhalf.poll());
	                }
	            }
	            if(size % 2 == 1){ 
	                if(higherhalf.size() > lowerhalf.size()) {

	                    median = higherhalf.peek();

	                } else {
	                    median = lowerhalf.peek();
	                }

	            } else { 
	                median = (lowerhalf.peek() + higherhalf.peek()) / 2;
	            }
	            System.out.println(median);
	        }
	    }
}
