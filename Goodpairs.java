package array;

import java.util.HashMap;
import java.util.Map;

public class Goodpairs {

	public static void main(String[]args)
	{
		Map<Integer,Integer> count =  new HashMap<Integer,Integer>();
		int[] nums = {1,2,3,1,1,3};
		int res = 0;
		for(int a :nums)
		{
			int cur = count.getOrDefault(a, 0);
			res +=cur;
			count.put(a, cur+1);
		}
		
		System.out.println("================= : " +res);
	}
}

// Time Complexity
//O(N) : As we are doing constant work in updating the count of each element using Hash Map, therefore time complexity will be O(N).
//Space Complexity 
//O(N) : We are using a Hash Map to store the count of each unique elements. There can be N different elements in worst case.