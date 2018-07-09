package Strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


public class String_Anagram {

	public static void main(String[] args) 
	{
		int count=0;
		String s1="cde";
		char[] a1 = s1.toCharArray();
		
		String s2="abc";
		char[] a2 = s2.toCharArray();
		
		TreeSet<Character> t=new TreeSet<Character>();
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					count++;
				}
			}
			if(count==0)
			t.add(a1[i]);
			count=0;
				
		}
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(a2[i]==a1[j])
				{
					count++;
					
				}
			}
			if(count==0)
			t.add(a2[i]);
			count=0;
				
		}
		System.out.println(t.size());
		System.out.println(t);
	}

}
