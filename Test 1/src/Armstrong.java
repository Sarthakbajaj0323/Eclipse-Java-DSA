import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
	       int num=s.nextInt();
	       int arm=0;
	       int temp=num;
	       int b=Integer.toString(num).length();
	       //System.out.println(b);
	       boolean val=false;
	       while(num!=0){
	           int rem=num%10;
	           int looped=1;
	           for(int i=0;i<b;i++) {
	              looped=looped*rem;
	           }
	           //System.out.println("loop is"+looped);
	           arm = arm + looped;
	           num /= 10;
	       }
	      // System.out.println("we get"+arm);
	       if(temp==arm){
	           val=true;
	       }

	       else{
	           val=false;
	       }
	       System.out.println(val);	
	    }
}
//import java.util.Scanner;
//public class Main {
//	    
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int count=0;
//        int t,r=0;
//        t=n;
//        while(n!=0)
//        {
//            n=n/10;
//            count++;
//        }
//        n=t;
//        int sum=0;
//        while(n!=0)
//        {   int p=1;
//           
//            r=n%10;
//            for(int i=1;i<=count;i++)
//            {
//               p=p*r;
//            }
//         sum=sum+p;
//         n=n/10;
//        }
//        if(sum==t)
//        {
//            System.out.println("true");
//        }
//        else
//            System.out.println("false");
//
//	}
//}

