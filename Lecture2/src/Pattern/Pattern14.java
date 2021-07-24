package Pattern;
import java.util.Scanner;
public class Pattern14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i =1;
        while(i<=n){
            char k=(char)('A'+i-1);
            int j=1;
            while(j<=i){
            System.out.print(k);
            k=(char)(k+1);
            j++;
            }
        System.out.println();
        i++;
        }

		

	}

}
