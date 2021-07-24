
public class Binary_Search {


	// element - number to be searched
	public static int binarySearch(int input[], int element)
    {
	 return indexFind(input,element,0,input.length-1);
	}
  	public static int indexFind(int input[],int element,int start,int end)
    {
     	
      int mid=(start+end)/2;
      if(start<=end)
      {
     	 if(input[mid]==element)
         {
        	return mid;		
         }
        if(input[mid]<element)
        {
          return indexFind(input,element,mid+1,end);
        }
        else if(input[mid]>element)
        {
          return indexFind(input,element,start,mid-1);
        }
      }
      return -1;
	}
}