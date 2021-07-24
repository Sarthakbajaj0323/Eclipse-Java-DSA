import java.util.Scanner;
public class bubblesort {

	public static void bubbleSort(int input[]){
		
		for(int i = 0; i < input.length - 1; i++){
			for(int j = 0; j < input.length - i -1; j++ ){
				if(input[j] > input[j + 1]){
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int var[]=new int[size];
		
		for(int i=0;i<var.length;i++) {
			var[i]=s.nextInt();
		}
		bubbleSort(var);
		for(int i = 0; i < var.length; i++){
			System.out.print(var[i] + " ");
		}
		
	}
	

	}



