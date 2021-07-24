
public class Print_all_permutations {

	public static void permutations(String input){
		// Write your code here
		permutations(new String(""), input);
	}
    
    public static void permutations(String arr, String str){
        if(str.length()==2){
            String a=str.substring(0,1)+str.substring(1);
            String b=str.substring(1)+str.substring(0,1);
            System.out.println(arr+a);
            System.out.println(arr+b);
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            permutations(arr+str.charAt(i), str.substring(0,i)+str.substring(i+1));
            
    	}
        
    }
}
