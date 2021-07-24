public class replacePI {

    // Return the changed string
    public static String replace(String input){



        // base condition 
        // if the string is empty 
        // or of length one 
        if (input.length() <= 1) { 
            return input; 
        } 

        // if the first character is 'p' 
        // and the first character of the part 
        // passed to recursion is 'i' then replace 
        //"pi" with "3.14" 
        if (input.charAt(0) == 'p' && input.charAt(1) == 'i') { 
            return "3.14" + replace(input.substring(2, input.length())); 
        } 

        // if the first character is not 'p' 
        // then just put that character in 
        // front of the answer which came 
        // from recursion 
        return input.charAt(0) + replace(input.substring(1, input.length())); 




    }
}