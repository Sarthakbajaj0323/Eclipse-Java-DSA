	import java.util.HashMap;

public class Max_no_freq {

		public static int maxFrequencyNumber(int[] arr){
			HashMap<Integer,Integer> hm= new HashMap<>();
			for(int i: arr){
	            if(hm.containsKey(i)){
	                hm.put(i,hm.get(i)+1);
	            }
	            else{
	                hm.put(i,1);
	            }
	        }
	        int max=Integer.MIN_VALUE;
	        int ans=0;
	        for(int i : arr){
	            if(hm.get(i)>max){
	                max=hm.get(i);
	                ans = i;
	            }
	        }
	        return ans;
		}
	}

