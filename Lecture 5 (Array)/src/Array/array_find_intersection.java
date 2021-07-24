package Array;

public class array_find_intersection {
	public static void intersections(int[] input1, int[] input2){
		for(int i=0;i<input1.length;i++){
            int var=input1[i];
            for(int j=0;j<input2.length;j++){
                if(var==input2[j]){
                    System.out.println(var);
                    input2[j]=Integer.MIN_VALUE;
                    break;
                }
                
            }
        }		
		
	}
}
