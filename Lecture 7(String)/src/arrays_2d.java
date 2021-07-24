import java.util.Scanner;
public class arrays_2d {

//	public static void main(String[] args) {
////		int arr2d[][] = new int[3][4];
////		System.out.println(arr2d[1][2]);
////		arr2d[2][0] = 15;
////		System.out.println(arr2d[2][0]);
//
////		int arr2[][] = {{1,2,3},{4,5,6}};
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter number of rows ");
//		int rows = s.nextInt();
//		System.out.println("Number of columns ");
//		int cols = s.nextInt();
//		int input[][] = new int[rows][cols];
//		for(int i = 0; i < rows; i++){
//			for(int j = 0; j < cols; j ++){
//				System.out.println("Enter element at "+i+" row "+j+" column");
//				input[i][j] = s.nextInt();
//			}
//		}
//
//		for(int i = 0; i < rows; i++){
//			for(int j = 0; j < cols; j++){
//				System.out.print(input[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
	public static void print2DArray(int input[][]) {
		// Write your code here

        Scanner s=new Scanner(System.in);
        int rows=input.length;
        int cols=input[0].length;
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                input[i][j]=s.nextInt();
                
            }
            for(int j=0;j<rows-i;j++){
                for(int z=0;z<cols;z++){
                    System.out.print(input[j][z]);
                }
            System.out.println();
            }
        }
	}
}
