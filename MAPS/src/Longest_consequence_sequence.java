import java.util.*;

public class Longest_consequence_sequence {
public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		
        ArrayList<Integer> output = new ArrayList<>();
        if(arr.length==1){
            output.add(arr[0]);
            return output;
        }
        
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
                map.put(arr[i], true);
			}
		}
        int len,start=0;
        int max_len=1,start_index=-1;
        int s=0;
        for (int i = 0; i < arr.length; i++){
            int temp=arr[i];
            len=1;
            map.put(arr[i], false);
            if (map.containsKey(arr[i]+1) && map.get(arr[i]+1)==true){
                start=arr[i];
               while(map.containsKey(temp+1) && map.get(temp+1)==true){
                   map.put(temp+1, false);
                   temp+=1;
                   len++;
               } 
            }
            temp=arr[i];
            if (map.containsKey(arr[i]-1) && map.get(arr[i]-1)==true){
                while(map.containsKey(temp-1) && map.get(temp-1)==true){
                    map.put(temp-1, false);
                    temp-=1;
                    len++;
               }
                start=temp;
            }
            
            int t=0;
            if(len>max_len){
                max_len=len;
                t=findIndex(arr, start);
                start_index=t;
                s=start;
            }
            
            else if(len==max_len && len>1){
                max_len=len;
                t=findIndex(arr, start);
                if(t<start_index){
                    start_index=t;
                    s=start;
                }
            }
        }
        
        if(max_len==1){
            output.add(arr[0]);
            return output;
        }
        
         for (int i = s; i < s+max_len; i++){
             output.add(i);
         }
        return output;
	}
    
    
    public static int findIndex(int arr[], int t) { 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==t){
                return i;
            }
        }
        return -1; 
    } 
}
