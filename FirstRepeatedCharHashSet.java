package string;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedCharHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(repeatedCharInString(str));
		input.close();
		
	}
	
	public static char repeatedCharInString(String str)
	{
		HashSet<Character> var = new HashSet<Character>();
		
	
		for(int i=0;i<str.length();i++)
		{
			if(var.contains(str.charAt(i)))
			{
				
				return str.charAt(i);
			}
			else
			{
			var.add(str.charAt(i));
			}
		}
		return '\0';
		
	}

}
