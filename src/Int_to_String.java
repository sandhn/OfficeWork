import java.util.Scanner;

public class Int_to_String
{
	public static void main(String[] args) 
	{
		
	try
	{
		System.out.println("Enter an interger");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	//String s = String.valueOf(n);
		String s = null;
		s =Integer.toString(n);
			System.out.println("Good job");
	}
	catch (Exception e)
	{
		System.out.println("Wrong ans");
	}
}
}
