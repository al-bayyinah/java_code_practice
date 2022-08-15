package array;

public class Shuffle_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "codeleet";
		int[] indices = {4,5,6,7,0,1,2,3};
		
		String output = "";
		
		for(int i=0;i<input.length();i++)
		{
			char c = input.charAt(indices[i]);
			output = output+c; //leetc
		}
		
		System.out.print(output);
	}

}
