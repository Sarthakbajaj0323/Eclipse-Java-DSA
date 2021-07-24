import java.util.*;

public class Pair_Sum_To_Zero {
	public static void PairSum(int[] input, int size) {
			
	        HashMap<Integer,Integer>map=new HashMap<>();
	        for(int element : input){
	            if(!map.containsKey(element)){
	                map.put(element,1);
	            }
	            else{
	                map.put(element,map.get(element)+1);
	            }
	        }
	        for(int element:input){
	            if(element==0 && map.get(element)>0){
	               int count =  map.get(element);
	               int freq =  (count*(count-1))/2;
	               while(freq-->0){
	                    System.out.println(element + " " + element);
	                } 
	                map.put(element,0);
	                
	            }
	            int pairelement=-1*element;
	            if(map.containsKey(pairelement)){
	                int freq=map.get(pairelement);
	                if(map.containsKey(element)){
	                    freq*=map.get(element);
	                }
	                map.put(element,0);
	                map.put(pairelement,0);
	                while(freq-->0){
	                    System.out.println(element<-1*(element) ? element + " " + (-1 * element) : (-1 * element) + " " + element);
	                }
	            }
	        }
		}
	
}
