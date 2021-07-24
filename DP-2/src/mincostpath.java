
public class mincostpath {
	public static int minCostPath(int input[][]) {
		   return minCostPath(input,0,0);
 }
 public static int minCostPath(int input[][],int i,int j) {
     int m=input.length;
     int n=input[0].length;
     
     if(i==m-1 && j==n-1)
         return input[i][j];
     
     if(i>=m || j>=n)
         return Integer.MAX_VALUE;
     
     
     int x=minCostPath( input, i, j+1);
     int y=minCostPath( input, i+1, j);
     int z=minCostPath( input, i+1, j+1);
     
     return input[i][j]+Math.min(z,Math.min(x,y));


	}
}
