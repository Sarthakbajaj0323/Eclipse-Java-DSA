package if_else;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i = s.nextInt();
		
		if(i%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}
