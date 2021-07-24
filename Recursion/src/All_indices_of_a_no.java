
public class All_indices_of_a_no {


    private static int[] allIndexes(int input[],int x, int startIndex)
    {   
        if(startIndex == input.length) {
			int output[] = new int[0];
			return output;
		}
		int smallAns[] = allIndexes(input, x, startIndex+1);
		if(input[startIndex] == x) {
			int output[] = new int[smallAns.length+1];
			output[0] = startIndex;
			for(int i=0; i<smallAns.length; i++) {
				output[i+1] = smallAns[i];
			}
			return output;
			
		}
		else {
			return smallAns;
		}
		
	}
	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input,x,0);
		
	}
	

}
