import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		int temp;
		for (int c=1;c<=n;c++) {
			temp=a+b;
			a=b;
					b=temp;

					System.out.println(a);
		}
	}

}
