package string;

public class palindrome {

	public static void main(String[] args)
	{
		String str, revstr;
		boolean flag = true;
		str ="roytor";
		char[] arr = str.toCharArray();
		int length = str.length();
		for(int i=0;i<=length/2;i++ ,length--)
		{
			if(arr[i]==arr[length-1])
				continue;
			else
			{
				flag = false;
				System.out.println(arr[i] + "   "+arr[length-1]);
				break;
			}
				
		}
		
		if(flag==false)
		{
			System.out.print("String is not palindrome");
		}
		
		else
		{
			System.out.print("String is palindrome");
		}
	}
}
