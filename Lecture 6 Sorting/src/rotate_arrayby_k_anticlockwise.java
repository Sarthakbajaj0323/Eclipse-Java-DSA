
public class rotate_arrayby_k_anticlockwise {


    public static int arrayRotateCheck(int[] arr){
        for (int i=1;i<arr.length;i++){
    		if(arr[i-1]>arr[i]){
                return i;
            }
        }
		return 0;
    }
}
