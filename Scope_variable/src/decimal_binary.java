import java.util.Scanner;
public class decimal_binary {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        long num=s.nextInt();
	        long bin=0;
	        
	        long placeval=1;
	        while(num!=0){
	            long rem=num%2;
	            num/=2;
	            bin=bin+rem*placeval;
	            placeval=placeval*10;
	                 
	        }
	        System.out.println(bin);

	}

}
