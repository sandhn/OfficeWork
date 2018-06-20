package Algorithms;

import java.util.Scanner;

public class Strong_Password {

	public static void main(String[] args) 
	{
		System.out.println("Enter th elnght of the password:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter the password:");
		Scanner scan1=new Scanner(System.in);
		String s = scan1.nextLine();
		char[] a = s.toCharArray();
		int countDigit=0, countSmall=0,countBig=0,countspl=0;
		if(n<6) {
			System.out.println("Less than 6 digits:"+(6-n));
		}
		
		for(char ch:a)
		{
			if(Character.isDigit(ch))
			{
				countDigit++;
			}
			else if(Character.isLowerCase(ch))
			{
				countSmall++;
			}
			else if(Character.isUpperCase(ch))
			{
				countBig++;
			}
			else
			{
				countspl++;
			}
		}
		if(countDigit==0)
		{
			System.out.println("Missing is a digit:Eg 1");
		}
		if(countSmall==0)
		{
			System.out.println("Missing a small character:Eg a");
		}
		if(countBig==0)
		{
			System.out.println("Missing a big character:Eg A");
		}
		if(countspl==0)
		{
			System.out.println("Missing a spl character:Eg *");
		}
				
	}

}
