package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class Caesar_Cipher {

	public static void main(String[] args) 
	{
		System.out.println("Enter th  length of the unencrypted string: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter the unencrypted string:");
		Scanner scan1=new Scanner(System.in);
		String s = scan1.nextLine();
		char[] s1 = s.toCharArray();
		System.out.println("Enter the number of letters to rotate the alphabet by.");
		Scanner scan3=new Scanner(System.in);
		int n1=scan3.nextInt();
		int data=0;
		String str="abcdefghijklmnopqrstuvwxyz";
		char[] dn= str.toCharArray();
		char[] en = str.toCharArray();
		int m=str.length();
		String final1="";
		char temp = 0, data1=0;
		for(int i=0;i<n1;i++)
		{
			temp=en[0];
			for(int j=0;j<m-1;j++)
			{
				
				en[j]=en[j+1];
				
			}
			en[m-1]=temp;
			
		}
		int count=0, count1=0;
		HashMap<Character, Integer> h= new HashMap<Character, Integer>();
		for(char ch:dn)
		{
			h.put(ch, count);
			count++;
		}
		System.out.println("Before encryption:"+h);
		HashMap<Integer, Character> h1= new HashMap<Integer, Character>();
		for(char ch:en)
		{
				h1.put(count1, ch);
				count1++;
		}
		System.out.println("After encryption:"+h1);
		for(int k=0;k<s1.length;k++)
		{
				 data = h.get(s1[k]);
				 data1=h1.get(data);
				 final1+=data1;
		}
		System.out.println("Final String:"+final1);
	}

}
