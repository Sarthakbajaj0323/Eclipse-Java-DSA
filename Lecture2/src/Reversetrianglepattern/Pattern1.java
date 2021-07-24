package Reversetrianglepattern;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
