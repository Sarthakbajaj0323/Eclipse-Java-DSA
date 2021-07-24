package if_else;

import java.util.Scanner;

public class greatestofthree {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		int c =s.nextInt();
		
		if(a>=b && b>=c) {
			System.out.println(a);
		}
		if(b>=c && b>=a){
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
// OR CAN BE DONE WITH IF   ELSE IF    ELSE
