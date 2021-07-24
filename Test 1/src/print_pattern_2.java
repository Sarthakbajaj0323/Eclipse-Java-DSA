import java.util.Scanner;
public class print_pattern_2 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	          int i=1;
	        while(i<=n){
	            int j=1;
	            while(j<=n){
	                if(j==i){
	                    System.out.print('*');
	                    
	                }
	                else{
	                    System.out.print('0');
	                }
	            j++  ;  
	            }
	            j--;
	            System.out.print('*');
	            
	            while(j>=1){
	                if(i==j){
	                    System.out.print('*');
	                    
	                }
	                else{
	                    System.out.print('0');
	                
	                }
	                j--;
	                
	            }
	            System.out.println("");
	                i++;
	            
	        }
	        
		}	
}
