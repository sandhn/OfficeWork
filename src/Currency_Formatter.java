import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency_Formatter {

	public static void main(String[] args) 
	{
		System.out.println("Enter Payment:");
		Scanner sc = new Scanner(System.in);
		double curr = sc.nextDouble();
		
		Locale indiaLocale = new Locale("en", "IN");
		
		NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
	    NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
	    NumberFormat Japan = NumberFormat.getCurrencyInstance(Locale.JAPAN);
	    
	    System.out.println("US:"+US.format(curr));
	    System.out.println("India:"+india.format(curr));
	    System.out.println("China:"+China.format(curr));
	    System.out.println("Japan:"+Japan.format(curr));
	}

}
