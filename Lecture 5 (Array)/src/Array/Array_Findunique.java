package Array;

public class Array_Findunique {

public static int findUnique(int[] arr){
		
        int var=0;
        for(int i=0;i<arr.length;i++){
            var=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                break;
            }
           
        }
         return var ;
	}

}
