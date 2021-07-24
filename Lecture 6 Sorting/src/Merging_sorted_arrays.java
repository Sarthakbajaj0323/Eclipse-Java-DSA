import java.util.Scanner;
public class Merging_sorted_arrays {

	public static int[] merge(int arr1[], int arr2[]){

        int i=0;
        int j=0;
        int k=0;
        
        int [] ans=new int[arr1.length+arr2.length];
        
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            i++;
            k++;
        }
		while(j<arr2.length){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int [] arr1=new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s.nextInt();
		}
		int n2=s.nextInt();
		int [] arr2=new int[n2];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=s.nextInt();
		}
		int []arr=merge(arr1,arr2);
		for(int k=0;k<n1+n2;k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
