
public class leaders_in_array {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        for(int i=0;i<input.length;i++){
            int j;
            for( j=i+1;j<input.length;j++){
                if(input[i]<input[j]){
                    break;
                }
                if(j==input.length-1){
                    System.out.print(input[i]+" ");
                }
            }
        }
         System.out.print(input[input.length-1]);
		
	}
}
//check the largest in the array along right side(input 11 3 5 7 9)(output 11 9)