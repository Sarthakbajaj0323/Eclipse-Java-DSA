import java.util.Scanner;
public class avgmarks {


	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
        String str=scan.next();
        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=scan.nextInt();
        
        int Avg=(i+j+k)/3;
        		
        System.out.println(str);
        System.out.print(Avg);
}
}

