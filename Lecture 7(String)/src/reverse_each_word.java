
public class reverse_each_word {

	public static String reverseEachWord(String input) {
		// Write your code here

//         int i=0;
//         String ans="";
//         int j=0;
//         while(i<input.length()){
//             if(input.charAt(i)==' '){
//                 j=i+1;
//                 ans+=input.charAt(i);
//             }
//             else{
//                 ans=ans.substring(0,j)+input.charAt(i)+ans.substring(j);
//             }
//             i++;
//         }
//         return ans;
        
        
          int start=0;
         String rev="";
    

     for (int i = 0; i <input.length(); i++) { 
       int end=0;
         int flag = 0;
         if (input.charAt(i)==' '){
                 end = i-1 ;  
             flag = 1;
             }
         else if(i == input.length()-1){
               end = i;
             flag = 2;
             }
            
             if(flag == 1 || flag==2){     
 	           for(int j=end;j>=start;j--)
                {
 	             rev=rev+(input.charAt(j)); 
                 
                }
                   if(flag!=2){
               rev = rev+" ";
                   }
                 
                 start = i + 1; 
                
             }
            
         } 
          
  
 return rev;
	}
}
