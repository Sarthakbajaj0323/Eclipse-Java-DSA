import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		int count=0;
		
		while(temp!=0) {
			temp/=10;
			count=count+1;
		}
		int var=num;
		
		int arm=0;
		while(var!=0) {
			int mul=1;
			int rem=var%10;
			for(int i=1;i<=count;i++) {
				mul=mul*rem; 
			}
			arm+=mul;
			var/=10;
		}
		if(num==arm) {
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
	}

}
