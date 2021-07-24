package Pattern;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
        	int var=i;
            int j=1;
            
        	while(j<=i){
            	System.out.print(var);
                var--;
                j++;
            }
        System.out.println();
        i++;
        }
		

	}

}
