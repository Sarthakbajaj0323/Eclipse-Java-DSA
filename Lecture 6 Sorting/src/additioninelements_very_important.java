
public class additioninelements_very_important {

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
	 int [] ans=new int[arr1.length>arr2.length ? arr1.length+1: arr2.length+1];
 	
	    
     int i=arr1.length-1;
     int j=arr2.length-1;
     int k=ans.length-1;
     int sum=0;
     int num=0;
     int carry=0;
     int temp=0;
     
     while(i>=0 || j>=0){
         
             if(i>=0 && j>=0){
             sum=arr1[i]+ arr2[j]+carry;
             }else if(j<0){
              sum=arr1[i]+carry;   
             }else if(i<0){
                 sum=arr2[j]+carry;
             }
             if(sum>=10){
                 
                 num=sum%10;
                 
                 ans[k-temp]=num;
                 carry=sum/10;
                 temp++;
                 i--;
                 j--;
             }else{
                 
                 num=sum;
                 ans[k-temp]=num;
                 carry=0;
                 temp++;
                 i--;
                 j--;
             }
             
         }
     
     return ans;
	}
	}
