package Repetiton;

import java.util.Arrays;

public class FirstTwoMAx {

	public static void main(String[] args) 
	{
		int[] a= {100,34,67,98,99,200,1};
		
		int second;
		int first=second=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i]!=first)
			{
				second=a[i];
			}
		}
		System.out.println(first+" " +second);

	}

}
