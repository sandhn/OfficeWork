package Algorithms;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) 
	{
		System.out.println("Enter a sentance without space");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] a = s.toCharArray();
		int count=0,j=0,u=0;
		String[] str= new String[5];
		
		for (int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(a[i]))
					{
				
				str[u] = s.substring(j, i);
				count++;
				j=i;
				u++;
					}
			if(s.length()-1==i)
			{
				count++;
			}
		}
		System.out.println(count);
		for(int i=0;i<str.length;i++)
		System.out.println(str[i]);

	}

}
