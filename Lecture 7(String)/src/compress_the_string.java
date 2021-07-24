
public class compress_the_string {

	public static String compress(String inputString) {
		// Write your code here
        
 		String ourString="";
        int count =0;
        
        
        
        for (int i=0; i<inputString.length(); i++){
            count=1;
            ourString+=inputString.charAt(i);
            

           while(i+1<inputString.length() && inputString.charAt(i)==inputString.charAt(i+1)){
                count++;
                
                i++;
            }
            if(count==1)
			ourString=ourString;
            else
            ourString=ourString+count;
        }

        return ourString;

	}
}
