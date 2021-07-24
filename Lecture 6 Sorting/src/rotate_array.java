
public class rotate_array {


    public static void rotate(int[] arr, int d) {
        //Your code goes here
              for(int i = 0; i < d; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
          
            for(j = 0; j < arr.length-d; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+d];  
            }  
            //First element of array will be added to the end  
            arr[j] = first;  
              }
    }
}
//public static void rotate(int[] arr, int d) {
//    //Your code goes here
//          for(int i = 0; i < d; i++){  
//        int j, first;  
//        //Stores the first element of the array  
//        first = arr[0];  
//      
//        for(j = 0; j < arr.length-1; j++){  
//            //Shift element of array by one  
//            arr[j] = arr[j+1];  
//        }  
//        //First element of array will be added to the end  
//        arr[j] = first;  
//          }
//}