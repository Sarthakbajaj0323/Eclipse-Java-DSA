
public class Higest_Occuring_character {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
      
        int arr[]=new int[256];
        for(int i=0;i<inputString.length();i++){
                arr[inputString.charAt(i)]++;
        }
        int max=-1;
        char ch=' ';
        for (int i=0;i<inputString.length();i++){
            if(max < arr[inputString.charAt(i)]) { 
       
                max = arr[inputString.charAt(i)];
                ch = inputString.charAt(i); 
            }
        }
        return ch;
}
}
