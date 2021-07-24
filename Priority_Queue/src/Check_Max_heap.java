
public class Check_Max_heap {
	public static boolean checkMaxHeap(int arr[]) {
		 for(int i=0;i<arr.length;i++)
       {
           int lc=2*i+1;
           int rc=2*i+2;
           
           if(lc<arr.length && arr[i]<arr[lc])
               return false;
           if(rc<arr.length && arr[i]<arr[rc])
               return false;
       }
       
       return true;
       
	}

}
