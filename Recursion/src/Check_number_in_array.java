
public class Check_number_in_array {
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input.length== 0)
        {
               return false; 
        }
        
        if(input[0]==x)
        return true;
        
        int small[]=new int[input.length-1];
            for(int i=1;i<input.length;i++)
            {
                small[i-1]=input[i];
            }
        boolean b =  checkNumber(small,x);
        return b;
	}
}
