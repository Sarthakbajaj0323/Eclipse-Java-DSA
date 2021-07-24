
public class RatInAMaze {

	public static void main(String[] args) {

		int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};
		boolean pathpossible=ratInAMaze(maze);
		System.out.print(pathpossible);
	}

	private static boolean ratInAMaze(int[][] maze) {
		int n=maze.length;
		int path[][]=new int[n][n];
		return solvemaze(maze,0,0,path);
	}

	private static boolean solvemaze(int[][] maze, int i, int j, int[][] path) {
		//check if i and j cell is valid or not
		int n=maze.length;
		if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1) {
			return false;
		}
		//include cell in the current path
		path[i][j]=1;
		//Destination cell
		if(i==n-1 && j==n-1) {
			return true;
		}
		//explore further in all directions
		//top
		if(solvemaze(maze,i-1,j,path)){
			return true;
		}
		//right
		if(solvemaze(maze,i,j+1,path)){
			return true;
		}
		//down
		if(solvemaze(maze,i+1,j,path)){
			return true;
		}
		//left
		if(solvemaze(maze,i,j-1,path)){
			return true;
		}
		return false;
	}

}
