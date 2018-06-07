import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args)
	{
		System.out.println("Enter a Number:");
		Scanner sc1 = new Scanner(System.in);
		 long i= sc1.nextLong();
		 
		
		 if(i>=-128 && i<=127)
		 {
			 System.out.println("Can fit in:");
			 System.out.println("* byte");
			 System.out.println("* short");
			 System.out.println("* int");
			 System.out.println("* long");
			 
		 }
		 else if(i>=-32768 && i<=32767)
		 {
			 
			 System.out.println("* short");
			 System.out.println("* int");
			 System.out.println("* long");
			 
		 }
		 
		 else if(i>=-2147483648 && i<=2147483647)
		 {
			 
			 System.out.println("* int");
			 System.out.println("* long");
			 
		 }
		/* else if(i>=-9223372036854775808 && i<=9223372036854775807)    Long variable is Not taking long value
		 {
			 System.out.println("Can fit in:");
			 System.out.println("* byte");
			 System.out.println("* short");
			 System.out.println("* int");
			 System.out.println("* long");
		 }*/
		 else 
		 {
			 System.out.println("Doesnot fit anywhere");
		 }
	}

}
