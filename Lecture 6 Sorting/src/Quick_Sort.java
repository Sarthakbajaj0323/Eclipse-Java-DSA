
public class Quick_Sort {

	public static int quicksort(int arr[],int first,int last){
		int i, j, pivot, temp;

		if(first<last){
			pivot=first;
			i=first;
			j=last;

			while(i<j){
				while(arr[i]<=arr[pivot]&&i<last)
					i++;
				while(arr[j]>arr[pivot])
					j--;
				if(i<j){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					j--;
				}
			}

			temp=arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
			quicksort(arr,first,j-1);
			quicksort(arr,j+1,last);

		}
		return 0;
	}
}

