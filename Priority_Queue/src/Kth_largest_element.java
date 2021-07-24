import java.util.*;
public class Kth_largest_element {
	public static int kthLargest(int arr[], int k) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        int i=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        for(int j=0;j<k-1;j++){
           pq.remove();
        }
        return pq.remove();
	}
}
