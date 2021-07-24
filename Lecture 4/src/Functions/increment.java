package Functions;

public class increment {

	 public static int func(int a) {
	        int b = a;
	        b = b + 10;
	        return b;
	    }

	    public static void main(String[] args) {
	        int a = 10;
	        
	        a=func(a);
	        System.out.println(a);
	    }
	
}
