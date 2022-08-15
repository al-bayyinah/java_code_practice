package array;

public class SortArrayAscending {

	public static void main(String[]args)
	{
		int[] arr = {5,67, 0, 33, 21};
		arrsort(arr);
		
		
	}

	public static int[] arrsort(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;	
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
			System.out.println(arr[i]);
		}
		return arr;
	}

	
}
