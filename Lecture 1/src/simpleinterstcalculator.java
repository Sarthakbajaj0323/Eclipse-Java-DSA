import java.util.Scanner;

public class simpleinterstcalculator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
				
		int p=s.nextInt();
		int r=s.nextInt();
		int t=s.nextInt();
		int si=(p*r*t)/100;
		
		System.out.println(si);
//
//		long l=s.nextLong();				
//		double d=s.nextDouble();
//		float f=s.nextFloat();
//		
//		string str=s.hasNextLine();
//		
//		String str=s.hasNext();
//		this will be terminated as there will be soace in betwenn the string 
//		
//		but to continue the string we have to use char c=str.charAt(0)
//		0 here means the privious value
	}

}
