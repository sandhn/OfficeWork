import java.util.Scanner;

public class Stdin_out {

	public static void main(String[] args) 
	{
	System.out.println("Enter integer value");
	Scanner scint= new Scanner(System.in);
	int i=scint.nextInt();
	System.out.println(i);
	
	System.out.println("Enter double value");
	Scanner scdouble= new Scanner(System.in);
	double d=scdouble.nextDouble();
	System.out.println(d);
	
	System.out.println("Enter string value");
	Scanner scstring= new Scanner(System.in);
	String s=scstring.next();
	System.out.println(s);
	}

}
