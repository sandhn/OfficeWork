package Algorithms;

import java.util.Scanner;

public class Mars_Exploration {

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the message:");
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		String s= "";
		int count=0;
		int sos= n/3;
		for(int j=0;j<sos;j++)
		{
			s+="SOS";
		}
		//String s= "SOSSOSSOSSOSSOSSOS";
		System.out.println("Enter a string of size"+n+" of less than"+n+" in mutliples of 3:");
		Scanner scan1=new Scanner(System.in);
		String s1 = scan1.nextLine();
		
		char[] arr = s.toCharArray();
		char[] arr1 = s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			if(arr[i]!=arr1[i])
			{
				count++;
			}
		}
		System.out.println("Number of Altered message letters are :"+count);
	}

}
