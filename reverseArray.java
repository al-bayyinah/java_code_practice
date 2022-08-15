package array;

public class reverseArray {

	public static void main(String[]args)
	{
		String str = "GEEKS";
		String newword = reverse(str);
		System.out.println(newword);
		
	}
	
	public static String reverse(String str)
	{
		
		int len = str.length()-1;   				//4
		char[] revword = str.toCharArray();
		char temp;
		for(int i=0;i<len;i++)						//0		1	2
		{
			temp = revword[i];                        //g	e	e
			revword[i]=revword[len];                //s		k	e
			revword[len] = temp;                    //g		e	e
			 len--;									//3		2	1
		}
		
		for(char c:revword)
		{
			System.out.print(c);
		}
		
		String retword = revword.toString();
		System.out.println(retword);
		
		return retword;
	}
}
