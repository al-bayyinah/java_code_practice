package string;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels {

	public static void main(String args[])
	{
	Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
	
	List<Character> al = Arrays.asList(vowels);
	String input = "Zeenat is my name";
	
	StringBuffer sb = new StringBuffer(input);
	System.out.println(sb);
	for(int i=0;i<sb.length();i++)
	{
		if(al.contains(sb.charAt(i)))
		{
			System.out.println("Vowel in input string is: "+input.charAt(i));
			sb.replace(i, i+1,"");
			i--;
			
		}
		
	}
	System.out.println(sb.toString());
}
}