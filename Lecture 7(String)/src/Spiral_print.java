
public class Spiral_print {

	public static void spiralPrint(int matrix[][]){
		
	int rowstart=0;
	int rowlength=matrix.length-1;
	
	int colstart=0;
	int collength=matrix[0].length-1;
	
	while(rowstart<=rowlength && colstart<=collength) {
		
		for(int i=rowstart;i<=collength;i++) {
			System.out.print(matrix[rowstart][i]+ " ");
		}
		rowstart++;
		
		for (int i=rowstart;i<=rowlength;i++) {
			System.out.print(matrix[i][collength]+" ");
		}
		collength--;
		
		if(rowstart<=rowlength) {
			for(int j=collength;j>=colstart;j--) {
				System.out.print(matrix[rowlength][j]+" ");
			}
		}	
		rowlength--;
		if(colstart<=collength) {
			for(int i=rowlength;i>=rowstart;i--) {
				System.out.print(matrix[i][colstart]+" ");
                                           }
		}
		colstart++;
	}
	}
	
}
