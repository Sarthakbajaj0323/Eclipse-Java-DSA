import java.util.Scanner;

public class sun_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        int cols=s.nextInt();
      
        int arr[][]=new int[rows][cols];
        int total=0;
        for(int i=0;i<rows;i++){
      		
            for(int j=0;j<cols;j++){
                arr[i][j]=s.nextInt();
                total+=arr[i][j];
            } 
        }
        System.out.print(total+" ");
	}
	

	}
///////// for coulum sum.....
//public static void main(String[] args) {
//
//	Scanner s=new Scanner(System.in);
//int rows=s.nextInt();
//int cols=s.nextInt();
//
//int arr[][]=new int[rows][cols];
//    for(int j=0;j<cols;j++)
//{
//		int total=0;
//      for(int i=0;i<rows;i++){
//        arr[i][j]=s.nextInt();
//        total+=arr[i][j];
//    }
//    System.out.print(total+" ");
//}
//
//}
