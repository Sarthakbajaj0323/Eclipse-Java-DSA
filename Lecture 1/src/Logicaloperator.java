import java.util.Scanner;

public class Logicaloperator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		boolean Largest =((a>=b)&&(a>=c));
		System.out.println(Largest);
		System.out.println((a>=b)||(a>=c));
		System.out.println(!(a>=b)); 

	}

}
