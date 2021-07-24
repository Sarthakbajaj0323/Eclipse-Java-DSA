
import java.util.Scanner;
public class Import_sequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pre=s.nextInt();
      
        
        int check=0;
        boolean flag=false;
        for(int i=1;i<=n-1;i++)
        {
            int cur=s.nextInt();
            
             
           if(pre==cur)
           {
               flag=false;
               break;
           }
            
            if(check==0)
            {
                if(pre>cur)
                 {
                    pre=cur;
                    flag=true;
                }
            }
            
             if(pre<cur)
            {
                pre=cur;
                flag=true;
                 check=1;
            }
             
             if(pre>cur)
            {
                 flag=false;
                 break;
            }
        }
 
        System.out.println(flag);
	}

}

