
public class MinStepstoone {
	public static int countStepsTo1(int n){

		if( n == 1 ) 
		{
			return 0;
		}

		int a1 = countStepsTo1( n-1 );
		int a2 = Integer.MAX_VALUE;
		int a3 = Integer.MAX_VALUE;

		if( n%2 == 0 ) a2 = countStepsTo1( n/2 );

		if( n%3 == 0 ) a3 = countStepsTo1( n/3 );

		return 1 + Math.min( a1 , Math.min( a2 , a3 ) ) ;

	}
	public static int countstepsM(int n) {
		int storage[]=new int [n+1];
		return countstepsM( n,storage);
	}
	private static int countstepsM(int n, int[] storage) {
		if(n==1) {
			storage[n]=0;
			return storage[n];
		}
		if(storage[n]!=0) {
			return storage[n];
		}
		int op1=countstepsM(n-1,storage);
		int min =op1;
		if(n%3==0) {
			int op2=countstepsM(n/3,storage);
			if(min>op2) {
				min=op2;
			}
		}
		if(n%2==0) {
			int op3=countstepsM(n/2,storage);
			if(min>op3) {
				min=op3;
			}
		}
		storage[n]=1+min;
		return storage[n];
	}
	public static int countStepsToDP(int n){
        int storage[] = new int[n+1];
        for(int i = 2 ; i <= n ; i++ ){
            int min = storage[i-1];
            if( i%3 == 0 && min > storage[i/3] ) min = storage[i/3];
            if( i%2 == 0 && min > storage[i/2] ) min = storage[i/2];
            storage[i] = min + 1;
        }
        return storage[n];
	}
}


