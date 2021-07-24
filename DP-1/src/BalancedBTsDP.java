
public class BalancedBTsDP {
	public static int balancedTreesOfHeightH(int n){
		   
	      int storage[] = new int[n+1];

	      storage[0] = 1;
	      storage[1] = 1;

	      for(int i = 2 ; i <= n ; i++){
	          int h1 = storage[i-1];
	          int h2 = storage[i-2];

	          int m = (int)Math.pow(10,9) + 7;
	        long res1 = ((long)h1*h1);
	        long res2 = ((long)h1*h2*2);

	        int val1 = (int)(res1%m);
	        int val2 = (int)(res2%m);

	        storage[i] = (val1 + val2)%m;
	      }
	        return storage[n];
		}
}
