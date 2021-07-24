
public class zeros_at_last {

	public static void pushZerosAtEnd(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
           
            }
         while(count<arr.length){
                arr[count]=0;
                count++;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
}
