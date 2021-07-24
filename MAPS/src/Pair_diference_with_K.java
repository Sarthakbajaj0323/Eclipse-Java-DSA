import java.util.*;
public class Pair_diference_with_K {
	public static void findPairsDifferenceK(int[] input, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:input){

            boolean flag=false;
            int p1=i+k;
            if(p1==i){
                flag =true;
            }
            if(map.containsKey(p1)){
                int f2=map.get(p1);
                for(int j=0;j<f2;j++){
                    if(p1<i){
                        System.out.println(p1+" "+i);
                    }
                    else{
                        System.out.println(i+" "+p1);
                    }
                }
            }
            int p2=i-k;
            if(map.containsKey(p2) && !flag){
                int f2=map.get(p2);
                for(int j=0;j<f2;j++){
                    if(p2<i){
                        System.out.println(p2+" "+i);
                    }
                    else{
                        System.out.println(i+" "+p2);
                    }
                }
            }
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
    }

}
