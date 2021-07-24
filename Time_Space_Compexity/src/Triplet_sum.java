
public class Triplet_sum {

	public static void sort(int a,int b,int c)
	{

		int[] arr=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		for(int i=0;i<3;i++)
		{   

			for(int j=i+1;j<3;j++)
			{  if(arr[i]>arr[j])
			{int temp;
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;}
			}
		}

		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}


	public static void FindTriplet(int[] input, int x){
		/* Your class should be named TripletSum.
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */
		for(int i=0;i<input.length;i++)
		{   

			for(int j=i+1;j<input.length;j++)
			{
				for(int k=j+1;k<input.length;k++)
				{

					if(x==(input[i]+input[j]+input[k]))
					{sort(input[i],input[j],input[k]);
					}
				}
			}

		}
	}
}
