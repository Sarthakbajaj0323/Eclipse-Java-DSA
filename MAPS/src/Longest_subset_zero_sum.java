import java.util.*; 
public class Longest_subset_zero_sum {
	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) 
	{

		HashMap<Integer, Integer> map = new HashMap<>(); 
		int start = -1;
		int end = -1; 
		int sum[] = new int[arr.size()];

		sum[0] = arr.get(0);

		map.put(sum[0], 0);

		for(int i = 1; i < sum.length; i++) 
		{ 
			sum[i] = sum[i - 1] + arr.get(i);
			map.put(sum[i], i); 
		} 


		for(int i = 0; i < sum.length; i++) { 
			if(map.get(sum[i]) > i && (map.get(sum[i]) - i > end - start || start == -1)) 
			{ 
				start = i; end = map.get(sum[i]); 
			} 
		} 
		if(map.get(0) != null && (start == -1 || map.get(0) > end - start || (map.get(0) == end - start - 1 && start > 0)))
		{
			start = -1; 
			end = map.get(0);
		}
		return (end - start); 
	}

}
