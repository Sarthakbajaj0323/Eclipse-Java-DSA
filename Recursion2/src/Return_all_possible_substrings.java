
public class Return_all_possible_substrings {

public static  String[] getCode(String input){
        
		if(input.length()==0){
            String[] narr=new String[1];
            narr[0]="";
            return narr;
        }
        
        
        String[] sans=getCode(input.substring(1));
        char c=(char)(input.charAt(0)-'0');
        String s=String.valueOf((char)('a'-1+c));
        String[] arr1=new String[sans.length];
        for(int i=0; i<sans.length; i++)
                arr1[i]=s+sans[i];
        //System.out.println("1 "+Arrays.toString(arr1));
        
        
        if(input.length()>=2){
        	String[] ssans=getCode(input.substring(2));
            int l=96+(Integer.parseInt(input.substring(0,2)));
            if(l>=97 && l<=122){
                char cc=(char)(l);
                String ss=String.valueOf(cc);
                String[] arr=new String[sans.length+ssans.length];
                int i,k=0;
                for(i=0; i<sans.length; i++){
                    arr[i]=s+sans[i];
                    k++;
                }
                for(i=0; i<ssans.length; i++){
                    arr[k]=ss+ssans[i];
                    k++;
                }
                //System.out.println("2 "+Arrays.toString(arr));
                return arr;
            }
        }
           
        return arr1;
	
}
}