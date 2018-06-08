import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number:");
		Scanner sc1 = new Scanner(System.in);
		  int n = sc1.nextInt();
		  int a=0,b=1;
		  System.out.println(a);
		  System.out.println(b);
		  for(int i=2;i<n;i++)
		  {
			  int c=a+b;
			  System.out.println(c);
			  a=b;
			  b=c;
			  	  
		  }
	}

}
