
public class largest_of_rowcolunm {

	
		// TODO Auto-generated method stub
		public static void findLargest(int input[][]){
			
			/* Your class should be named Solution.
			* Don't write main() function.
		 	* Don't read input, it is passed as function argument.
		 	* Print output as specified in the question
			*/
	        int largestrow=Integer.MIN_VALUE;
			int rows=input.length;
	        int cols=input[0].length;
	        int q=0;
	        int r=0;
			for(int i=0;i<rows;i++){
	            int totalrows=0;
	            for(int j=0;j<cols;j++){
	                totalrows+=input[i][j];
	            }
	            if(totalrows>largestrow){
	                largestrow=totalrows;
	                q=i;
	            }
	        }
	        int largestcol=Integer.MIN_VALUE;   
	        for(int k = 0; k < cols; k++){
				int totalcols= 0;
				for(int l = 0; l < rows; l++){
					 totalcols+=input[l][k];
	            }
	            if(totalcols>largestcol){
	                largestcol=totalcols;
	                r=k;
		}
	        }
	        if(largestrow>largestcol){
	            System.out.print("row"+" "+q+" " + largestrow);
	        }else
	             System.out.print("column"+" "+r+" "+largestcol);
			
	    }
	}


