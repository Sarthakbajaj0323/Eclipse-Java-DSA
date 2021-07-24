
public class StairCase {
	
		
		public static long staircase(int n){
				
			  long output[] = new long[n+1];
		        if(n<=0)
		            return 1;
		        if(n==1)
		            return 1 ;
		        if(n==2)
		            return 2;
		        output[0]=output[1]=1;
		        output[2]=2;
		        for(int i=3;i<output.length;i++)
		        {
		            output[i]=output[i-1]+output[i-2]+output[i-3];
		        }
		        return output[n];
			}
			
		}

