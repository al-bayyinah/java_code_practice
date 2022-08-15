package array;

import java.util.Arrays;

public class MInMAXSort {
	
	public static class Pair{
		public int min;
		public int max;
	}

	public static Pair getminmax(int arr[],int N) {
		Arrays.sort(arr);
		Pair minmax = new Pair();
		minmax.min = arr[0];
		minmax.max = arr[N-1];
		return minmax;
		
	}
	
	public static void main(String[]args)
	{
		int[] arr = {0,1,21,3,74,5};
		int N = arr.length;
		System.out.println("numbers are "+getminmax(arr,N).max +" " +getminmax(arr,N).min);
	}
}
