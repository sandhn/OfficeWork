package Algorithms;

public class Palindrome {

	public static void main(String[] args) 
	{
		int n=151515;
		int temp=n;
		int rem,sum,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		if(temp==rev)
		System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
