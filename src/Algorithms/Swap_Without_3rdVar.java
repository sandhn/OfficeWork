package Algorithms;

public class Swap_Without_3rdVar {

	public static void main(String[] args) 
	{
		/*int a=2,b=3;
		System.out.println("Initial Value of a:"+a);
		System.out.println("Initial Value of b:"+b);
		
		int a1,b1=0;
		a1=(a+b)-a;
		b1=(a+b)-b;
		System.out.println("Value after swapping of a:"+a1);
		System.out.println("Value after swapping of b:"+b1);
		*/
		 int x = 10;
	        int y = 20;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        x = x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);

	}

}
