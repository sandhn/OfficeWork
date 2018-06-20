package Algorithms;

public class SuperReducedString {

	public static void main(String[] args) 
	{
		String str= "aaabccddd";
		int i=0;
		String sub1,sub2;
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				sub1=str.substring(i, i+1);
				sub2=str.substring(i+2);
				str=sub1+sub2;
				i=0;
				System.out.println(str);
			}
			else
			{
				System.out.println(str);
			}
			
		}
	

	}

}
