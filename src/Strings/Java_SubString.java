package Strings;

import java.util.Scanner;

public class Java_SubString 
{
	public static void main(String[] args)
	{	
		System.out.println("Enter a String:");
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        System.out.println("Enter start point:");
        int start = in.nextInt();
        
        System.out.println("Enter end point:");
        int end = in.nextInt();
        
        String sub=S.substring(start, end);
        System.out.println(sub);
    }
}
