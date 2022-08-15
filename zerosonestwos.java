package array;

public class zerosonestwos {

	public static void main(String args[])
	{
		int[] arr = {1,2,0,2,2,1,1,0,0};
		
		//Count the 0s 1s 2s
		int count0s = 0;
		int count1s = 0;
		int count2s = 0;
		int i = arr.length-1;
		 // Count the number of 0s, 1s and 2s in the array
        for (i = 0; i < arr.length; i++) {
            switch (arr[i]) {
            case 0:
                count0s++;
                break;
            case 1:
                count1s++;
                break;
            case 2:
                count2s++;
                break;
            }
        }
        
		int k = 0;
		while(count0s>0)
		{
			arr[k] = 0;
			k++;
			count0s--;
		}
		while(count1s>0)
		{
			arr[k] = 1;
			k++;
			count1s--;
		}while(count2s>0)
		{
			arr[k] = 2;
			k++;
			count2s--;
		}
		
		for(int l=0;l<arr.length;l++)
		{
		System.out.print("==" +arr[l]);
	}
}}
