import java.util.Scanner;

public class Static_Block_Initi {

	
	static
	{
		System.out.println("Enter Breadth:");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		
		System.out.println("Enter width:");
		Scanner sc2 = new Scanner(System.in);
		int w = sc2.nextInt();
		
		int area= b*w;
		try
		{
		if(b<=0||w<=0)
			throw new Exception("Breadth and height must be positive");
		else
			System.out.println("Area is:"+area);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	public static void main(String[] args) 
	{
		
	}

}
