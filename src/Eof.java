import java.util.Scanner;

public class Eof {

	public static void main(String[] args) 
	{
		System.out.println("Enter a para");
		Scanner scan = new Scanner(System.in);
		int i=1;
		//String s = scan.nextLine();
		while(scan.hasNext())
		{
			String s = scan.nextLine();
			System.out.println(i+" "+s);
			i++;
		}
		
		/*Scanner scan = new Scanner(System.in);
		   for(int i = 1; scan.hasNext()== true; i++)
		   {
		       System.out.println(i + " " + scan.nextLine());
		   }
		   */
	}

}
