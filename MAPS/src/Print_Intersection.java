import java.util.*;

public class Print_Intersection {

	public static void intersection(int[] arr1, int[] arr2){


		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		for(int i = 0; i < arr1.length; i++)
		{ 
			if(!map.containsKey(arr1[i]))
			{ 
				map.put(arr1[i],1); 
			} 
			else 
			{ 
				map.put(arr1[i], map.get(arr1[i]) + 1); 
			} 
		} 
		for(int i = 0; i < arr2.length; i++)
		{
			if(map.containsKey(arr2[i]))
			{ 
				int value = map.get(arr2[i]);
				if(value > 0)
				{ 
					System.out.println(arr2[i]);
					map.put(arr2[i], value - 1);
				} 
			} 
		} 
	}
}

