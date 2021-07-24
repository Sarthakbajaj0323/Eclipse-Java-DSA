package Array;

public class Array_duplicate {

	public static int duplicate(int[] arr){
		
		
        int var=0;
        for(int i=0;i<arr.length;i++){
            var=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==2){
                break;
            }
           
        }
         return var ;
		
	}
	
}
