
public class N_Queens {

	    
	    private static boolean isboardsafe(int[][] board, int row, int col) {
	            int q = board.length;
	            for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
	                if(board[i][j]==1){
	                    return false;
	                }
	            }
	            for(int i=row+1,j=col+1;i<q&&j<q;i++,j++){
	                if(board[i][j]==1){
	                    return false;
	                }
	            }
	            for(int i=row-1,j=col+1;i>=0&&j<q;i--,j++){
	                if(board[i][j]==1){
	                    return false;
	                }
	            }
	            for(int i=row+1,j=col-1;i<q&&j>=0;i++,j--){
	                if(board[i][j]==1){
	                    return false;
	                }
	            }
	            for(int i=row-1;i>=0;i--){
	                if(board[i][col]==1){
	                    return false;
	                }
	            }
	            for(int i=row+1;i<q;i++){
	                if(board[i][col]==1){
	                    return false;
	                }
	            }
	            return true;
	        }	
	    
	    private static void placequeen(int [][] board,int row,int n){
	        if(row==n){
	            for(int i=0;i<n;i++){
	                for(int j=0;j<n;j++){
	                    System.out.print(board[i][j]+" ");
	                }

	            }
	            System.out.println();
	        }
			for(int j=0;j<n;j++){
	            if(isboardsafe(board,row,j)){
	                board[row][j]=1;
	                placequeen(board,row+1,n);
	                board[row][j]=0;
	            }
	        }
	        
	    }
	    
		public static void placeNQueens(int n){

	        int board [][]=new int[n][n];
	        placequeen(board,0,n);
		}
}


