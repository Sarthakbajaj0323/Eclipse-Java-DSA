import java.util.Scanner;
public class range_prime {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		for(int i=2;i<=n;i++) {
			boolean isprime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
				if(isprime) {
					System.out.print(i);
				}
			}
		}
	}

}
