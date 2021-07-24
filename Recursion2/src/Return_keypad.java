
public class Return_keypad {

	public static char[] numberoptions(int n)
	{
		switch(n)
		{
		case 2:	
			char options2[]= {'a' , 'b' ,'c'};
			return options2;

		case 3:
			char options3[]= {'d' , 'e' ,'f'};
			return options3;
		case 4:
			char options4[]= {'g' , 'h' ,'i'};
			return options4;


		default:
			char options[]= {'\0'};
			return options;
		}
	}


	public static String[] returnkeypad(int n)
	{
		// Write your code here
		if(n==0) {
			String ans[]= {""};
			return ans;
		}
		int lastdigit=n%10;
		int smallnumber=n/10;
		String smallans[]=returnkeypad(smallnumber);
		char options[]=numberoptions(lastdigit);
		String []ans=new String[smallans.length * options.length];
		int k=0;
		for(int i=0 ; i<smallans.length ;i++) {
			for(int j=0 ; j<options.length ; j++) {
				ans[k]=smallans[i] + options[j];
				k++;
			}
		}
		return ans;
		
		
	}

	public static void main(String [] args) {
	
	int num =234;
	String []ans=returnkeypad(num);
	for(int i=0; i<ans.length; i++) {
		System.out.print(ans[i]+" ");
	}
}
	}
