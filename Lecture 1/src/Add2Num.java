import java.util.Scanner;

public class Add2Num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Please enter the number of strings you want to enter: ");   
		//takes an integer input         
		String[] string = new String [sc.nextInt()];      
		//consuming the <enter> from input above  
		//sc.nextLine();   
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextLine();  
		}  
		System.out.println("\nYou have entered: ");  
		//for-each loop to print the string  
		for(String str: string)   
		{  
		System.out.println(str);  
		}  
//		short s=123;
//				
//		long l=12345;
//		
//		double d=1.23;
//		
//		char c = 'a';
//				
//		boolean b = true;
//		boolean otherB = false;
	}
	
		

}
