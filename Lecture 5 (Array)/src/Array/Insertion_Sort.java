package Array;

public class Insertion_Sort {

	public static void insertionSort(int[] arr) {
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];  
                }else{
                    break;
                }
                
              j--;
             
            }
             arr[j+1]=temp;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,4,3,5,2,1,9};
		insertionSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
