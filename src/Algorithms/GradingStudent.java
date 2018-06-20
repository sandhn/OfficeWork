package Algorithms;

import java.util.Scanner;

public class GradingStudent {

	public static void main(String[] args) 
	{
		// Did not work
		System.out.println("Enter number of student:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num;
		
		int[] grade=new int[n];
		int[] grade1=new int[n];
		System.out.println("Enter the grade:");
		for(int i=0;i<n;i++)
		{
			grade[i]= scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			num=(grade[i]%10);
			if(num<5)
				grade[i]=grade[i]-(grade[i]%10)+5;
			else if(num>5)
				grade1[i]=grade[i]+1;
				if((grade1[i]%10)<5)
					grade1[i]=grade1[i]-(grade1[i]%10)+5;
			else
			grade[i]=grade[i];
			
				
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(grade[i]);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(grade1[i]);
		}
	}

}
