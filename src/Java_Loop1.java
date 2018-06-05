import java.util.Scanner;

public class Java_Loop1 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number for its tables");
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=10;i++)
        {
        	int res=n*i;
        	System.out.println(n+"X"+i+"="+res);
        }
	}

}
