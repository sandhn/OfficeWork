package Algorithms;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) 
	{
		System.out.println("Enter size of array");
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int[] a= new int[n];
		int temp=0;
		System.out.println("Enter array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			 System.out.print("Sorted elements are"+a[i]);
		}
	}

}
