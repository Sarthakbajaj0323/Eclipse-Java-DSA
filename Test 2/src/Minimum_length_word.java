
public class Minimum_length_word {

public static String minLengthWord(String input){
		
		// Write your code here

        String[] arr=input.split(" ");
        int i=0;
        int minlength;
        minlength=Integer.MAX_VALUE;
        String smallest;
        smallest = "";
        for(i=0;i<arr.length;i++){
            if(arr[i].length() < minlength){
                smallest=arr[i];
                minlength=arr[i].length();
            } 
            
        }
       return smallest;
	}
}
