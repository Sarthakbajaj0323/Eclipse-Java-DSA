
public class Quick_sort {

	public static void quicksort(int input [] ,int si , int ei) {
		if(si>=ei) {
			return;
		}
		int pivotpos=partition(input , si , ei);
		quicksort(input , si , pivotpos-1);
		quicksort(input , pivotpos+1 ,ei);

}
	
	public static int partition(int num[] , int si, int ei){
       int count=0;
       int pivot=num[si];
       for (int i=si+1;i<num.length;i++) {
    	   if(pivot>=num[i]) {
    		   count++;
    	   }
       }
       int pivotpos=si+count;
       int temp=num[pivotpos];
       num[pivotpos]=num[si];
       num[si]=temp;
       
       int i=si;
       int j=ei;
       
       while(i<pivotpos && j>pivotpos) {
    	   if(num[i]<=pivot)
    		   i++;
    	   else if(num[j]>pivot)
    		   j++;
    	   else {
    		   temp=num[i];
    		   num[i]=num[j];
    		   num[j]=temp;;
    		   i++;
    		   j--;
    	   }
       }
       return pivotpos;
       
       }
	public static void main(String[] args) {
		int []arr={10,23,9,7,5,4};
		quicksort(arr , 0 , arr.length-1);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
 }
