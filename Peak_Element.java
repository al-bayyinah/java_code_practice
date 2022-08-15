package array;

public class Peak_Element {

	public static void main(String args[])
	{
		int arr[] = {2,1,3,1,67,5,22,88,5,1,6};
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i+1]>arr[i] && arr[i+1]>arr[i+2])
			{
				System.out.println("======================   " +(i+1));
				break;
			}
		}
	}
}
