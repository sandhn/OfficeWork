import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList arr= new ArrayList();
		for (int i=0;i<3;i++)
		{	
			String j=sc.nextLine();
			arr.add(j);
		}

		 Iterator i = arr.iterator();
		 while(i.hasNext())
		 {
			  Object m = i.next();
			  System.out.println(m);
		 }
	}

}
