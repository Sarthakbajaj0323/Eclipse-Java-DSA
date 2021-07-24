import java.util.Scanner;
public class important_Sequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int prev =s.nextInt();
		int count=2, current;
		boolean isdec=true;
		while(count<=n) {
			current=s.nextInt();
			count++;
			if(current==prev) {
				System.out.println();
				return;
			}
			if(current<prev) {
				if(isdec==false) {
					System.out.println(false);
					return;
				}
				else {
					if(isdec==true) {
						isdec=false;
					}
				
			}
			prev=current;
				}
			System.out.println(true);
			
		}
	}

}
