import java.util.*;
public class CP {
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int l=s.nextInt();
	while(l!=0){
	int n=s.nextInt();
	int k=s.nextInt();
	int d=s.nextInt();
	int sum=0;
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
        sum=sum+arr[i];
	    }
	int res =sum/k;
	if(res>=d){
	    System.out.println(d);
	}
	else{
	    System.out.println(res);
	}
	l--;
	}
	}
}
