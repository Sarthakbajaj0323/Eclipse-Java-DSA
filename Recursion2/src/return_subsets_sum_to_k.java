
public class return_subsets_sum_to_k {

	  public static void printSubsets(int[] input, int start, int[] output){
	        
		    
	        if(start==input.length){
	            
	            for(int i=0; i < output.length; i++){
	                System.out.print(output[i]+" ");
	            }
	            System.out.println();
	            return;
	        }
	        
	        printSubsets(input, start+1, output);
	        int[] newOutput=new int[output.length+1];
	        
	        for(int i=0; i < output.length; i++){
	           newOutput[i]=output[i];
	        }
	        
	    
	        newOutput[newOutput.length - 1]=input[start];
	        printSubsets(input, start+1, newOutput);
	        
	        
	    }
	    
		public static void printSubsets(int input[]) {

	        int[] output = new int[0];
	        printSubsets(input, 0, output);

		}
	  
}
