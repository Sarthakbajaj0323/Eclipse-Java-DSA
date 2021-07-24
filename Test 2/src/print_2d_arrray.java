
public class print_2d_arrray {

	public static void print2DArray(int input[][]) {
		// Write your code here
//first line n times then n-1 times and so onnn

        int n=input.length;
        int m=input[0].length;
        
        int count=n;
        
        for(int i=0;i<n;i++){
            
            for(int k=1;k<=count;k++){
                
                for(int j=0;j<m;j++){
                    System.out.print(input[i][j]+" ");
                }
                System.out.println();
            }
            
            count--;
        }
    }
}
