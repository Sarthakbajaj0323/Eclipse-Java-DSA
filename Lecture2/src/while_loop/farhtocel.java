package while_loop;

import java.util.Scanner;
public class farhtocel {

	public static void main(String[] args) {



			
				
				Scanner s= new Scanner(System.in);
		        int S=s.nextInt();
		        int E=s.nextInt();
		        int W=s.nextInt();
		       	int C;
		        while(S<=E)
		        {
		        	C=(5*(S-32))/9;  
		        	System.out.print(S);
			  	    System.out.print("     ");
		        	System.out.println(C);
		        	S=S+W;
		        }
			}
}
		


	

