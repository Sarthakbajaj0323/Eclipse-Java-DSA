import java.util.Scanner;

public class farhnahitetocelsius {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int f= s.nextInt();
		//int cel=(5/9)*(f-32);
		int cel=(5*(f-32))/9;
		
		int cel=(int) (5.0/9)*(f-32);  //explicit typecasting
		System.class.outprintln(cel);
		
		System.out.println(9/5);
		System.out.println(9.0/5);
		
		System.out.println(9+5);
		System.out.println(9-5);
		System.out.println(9/5);
		System.out.println(9*5);
		
		System.out.println(9%5);
		
		System.out.println('A'+1);  //ASCII   A=66  a=97
		System.out.println('a'+'b'); //a=97 b=98
		
		char c='a';
		char i =(char)(c+3);  // Ans=d
	}
	}
	

}
