package array;

public class ArrayFromPermutaion {

public static void main(String[]args)
{

	int[] input = {0,2,1,5,3,4};
	int[] output = new int[input.length];
	String[] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"}; 
	int count = 0;
	 int res=0;
	 int temp=0;
	 for(int j=0;j<sentences.length;j++)
     {
         String s = sentences[j]; 
         count = s.split(" ").length;
         if (count>temp)
         {	
        	 res = count;
        	 temp = count;
         }        
     }
	 System.out.println(res);
	for(int i=0;i<input.length;i++)
	{
		output[i] = input[input[i]];
		System.out.print(output[i]+" ");
	}
	
	
}
}
