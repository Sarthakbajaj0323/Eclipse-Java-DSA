package Reversetrianglepattern;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space=space+1;
			}
				int j=1;
				int p=i;
				while (j<=i) {
					System.out.print(p);
					p++;
					j++;
				}
            
				 p=2*i-2;
				 j=1;
					while(j<=i-1) {
						System.out.print(p);
						p--;
						j++;
					}
		System.out.println();
		i++;
			}
	

	}

}
