import java.util.*;
public class Merge_K_Sorted_Elements {
	  public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
	       
	        //PriorityQueue<Integer> heap=new PriorityQueue<Integer>();
	        PriorityQueue<Integer> heap2=new PriorityQueue<Integer>();
	        int x=input.size();
	        for(int i=0;i<x;i++)
	        {
	            for(int k=0;k<input.get(i).size();k++)
	            {
	                heap2.add(input.get(i).get(k));
	            }
	        }
	        ArrayList<Integer> a1=new ArrayList<Integer>();
	        a1.addAll(heap2);
	        Collections.sort(a1); 
	        return a1;
	    }
}
