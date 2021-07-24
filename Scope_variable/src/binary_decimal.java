import java.util.Scanner;
public class binary_decimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    	int bin=0;
      
        int b=1;
        while(n>0){
            int digit=n%10;
            bin=bin+digit*b;
            b*=2;
            n/=10;
            
        }
        System.out.println(bin);
	}

}
