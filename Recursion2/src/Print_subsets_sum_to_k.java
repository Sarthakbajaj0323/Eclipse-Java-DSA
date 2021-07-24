
public class Print_subsets_sum_to_k {

	public static void printSubsetsSumTok(int input[],int start, int k, int[] output){
        
        if(start==input.length){
           
            if(k==0)
            {
           for(int i=0; i < output.length; i++)
           {
             System.out.print(output[i]+" ");
          }
           System.out.println();
           return;
            }
            else
            {
                return;
            }
       }
       
        printSubsetsSumTok(input, start+1,k, output);
       int[] newOutput=new int[output.length+1];
       
       for(int i=0; i < output.length; i++){
          newOutput[i]=output[i];
       }
       
   
       newOutput[newOutput.length - 1]=input[start];
       printSubsetsSumTok(input,start+1,k-input[start],newOutput);
        
       
       
   }
   
   
   
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
       int[] output = new int[0];
		printSubsetsSumTok(input,0, k, output);
	}
}
