package Array;

public class Array_pairsum {
	public static void tripletSum(int[] input, int x){
		 for(int i=0;i<input.length;i++){
           int var=input[i];
           for(int j=i+1;j<input.length;j++){
               for(int k=j+1;k<input.length;k++){
           		   if(x==var+input[j]+input[k]){
              		     if(var>=input[j] && var>=input[k]){
                            if(input[j]>=input[k]){
                                System.out.println(input[k]+" "+input[j]+" "+var);
                            }
                            else
                                 System.out.println(input[j]+" "+input[k]+" "+var);
              		     }
                   
                   else if(input[k]>=input[j] && input[k]>=var){
                        if(input[j]>=var){
                                System.out.println(var+" "+input[j]+" "+input[k]);
                            }
                            else
                                 System.out.println(input[j]+" "+var+" "+input[k]);
                   }
                   else
                       if(var>=input[k]){
                       System.out.println(input[k]+" "+var+" "+input[j]);
                       }
                       else
                                    System.out.println(var+" "+input[k]+" "+input[j]);     
                   
                        }    
                   
               }
                      }
               }
               
           }
       
	
}
	//public static void pairSum(int[] input, int x){
//		
//        for(int i=0;i<input.length;i++){
//            int var=input[i];
//            for(int j=i+1;j<input.length;j++){
//                if(x==var+input[j]){
//                    if(var>=input[j]){
//                    System.out.println(input[j]+" "+var);
//                    }
//                    else
//                    System.out.println(var+" "+input[j]);
//                }
//                
//            }
//        }
//	}
//}
