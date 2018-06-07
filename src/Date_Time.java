import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Date_Time {

	public static void main(String[] args)
	{
		System.out.println("Enter Date:");
		Scanner sc1 = new Scanner(System.in);
		int date = sc1.nextInt();
		
		System.out.println("Enter Month:");
		Scanner sc2 = new Scanner(System.in);
		int month = sc2.nextInt();
		
		System.out.println("Enter Year:");
		Scanner sc3 = new Scanner(System.in);
		int year = sc2.nextInt();
		
		LocalDate dt = LocalDate.of(year, month, date);
		DayOfWeek day = dt.getDayOfWeek();
		System.out.println("Day is:"+day);
		
	}

}
