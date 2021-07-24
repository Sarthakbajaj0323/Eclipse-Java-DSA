import java.util.Scanner;
public class print_pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
          int i,j;
    for(i=1;i<=n;i++){  
       for(j=n;j>=1;j--){
           if(j!=i)  
            System.out.print(j);  
            else  
             System.out.print("*");  
    }   
    System.out.println("");  
    }  
       
	}
}
