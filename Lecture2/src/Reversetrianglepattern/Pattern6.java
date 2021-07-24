package Reversetrianglepattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		   Scanner s= new Scanner(System.in);
	       int n=s.nextInt();
		   int i=1;
	        int n1=n/2+1;
	       

	            while(i<=n1)
	            {
	                int space=1;
	                while(space<=n1-i){
	                    System.out.print(" ");
	                    space++;
	                }
	                int j=1;
	                while(j<=i*2-1){
	                    System.out.print("*");
	                    j++;
	                }

	                System.out.println();
	                i++;
	            }

	        
	            int n2=n-n1;
	            i=n2;
	           while(i>=1)
	            {
	                int space=1;
	                while(space<=n2-i+1){
	                    System.out.print(" ");
	                    space++;
	                }
	                int j=1;
	                while(j<=i*2-1){
	                    System.out.print("*");
	                    j++;
	                }

	                System.out.println();
	                i--;

	}

}
