package Break_Continue;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        while(i<=n){
            int count=0;
            int m=i;
            int l=1;
            while(l<=m){
                if(m%l==0){
                    l++;
                    count=count+1;
                    
                }
                else{
                    l=l+1;
                }
            }
            if(count==2){
                System.out.println(i);
                i++;
            
            
            }
        i++;
        }

	}

}
