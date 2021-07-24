import java.util.Scanner;
public class Pattern15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char q=(char)('A'+n-1);
        
        int i=1;
        while(i<=n){
            
            int j=1;
            char k=(char)(q-i-j+2);
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
