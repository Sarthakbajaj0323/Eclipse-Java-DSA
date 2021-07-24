
public class Sort_012 {

	public static void sort012(int arr []) {
		int var=0;
		int zar=arr.length-1;
		int i=0;
		while(i<=zar) {
			if(arr[i]==0) {
				int temp=arr[var];
				arr[var]=arr[i];
				arr[i]=temp;
				i++;
				var++;
			}
			else if(arr[i]==2) {
				int temp=arr[zar];
				arr[zar]=arr[i];
				arr[i]=temp;
				zar--;
			}
			else 
				i++;
		}
	}
}

//public static void sort012(int[] arr){
//    int count=0;
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]==0){
//            count++;
//        }
//        int count1=0;
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]==1){
//            count1++;
//    }
//    for (int j=0;i<count;i++){
//        arr[j]=0;
//    }
//    for (int j=count;i<count1;j++){
//        arr[j]=1;
//    }
//    for (int j=count1;i<arr.length;j++){
//        arr[j]=2;
//    }
//}