package Algorithms;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) 
	{	
		System.out.println("Enter size of array");
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int[] a= new int[n];
		int[] b= new int[n];
		int temp=0;

		System.out.println("Enter array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("Enter array rotation times:");
		Scanner sn=new Scanner(System.in);
		int m= sn.nextInt();

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n-1;j++)
			{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
			
		}
		for(int i=0;i<n;i++)
		{
			 System.out.print(""+a[i]);
		}
	}

}
