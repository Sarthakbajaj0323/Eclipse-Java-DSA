import java.util.Scanner;
public class WAve_print {

	public static void wavePrint(int input[][]){
		Scanner s=new Scanner(System.in);
        int rows=input.length;
        int cols=input[0].length;
        for (int i=0;i<cols;i++){
            if(i%2==0){
            for (int j=0;j<rows;j++){
                System.out.print(input[j][i]+" ");
            }
            }
            else{
             for (int j=rows-1;j>=0;j--){
                System.out.print(input[j][i]+" ");
    	        }   
            }
        }
    }
}
