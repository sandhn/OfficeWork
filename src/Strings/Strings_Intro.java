package Strings;

import java.util.Scanner;

public class Strings_Intro
{
	 public static void main(String[] args) 
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 2 strings:");
     String A=sc.next();
     String B=sc.next();
   
     int a=A.length();
     int b=B.length();
     int count=a+b;
     System.out.println(count);
     
     if(a>b)
          System.out.println("Yes");
     else
         System.out.println("No");
     
     String Acap = A.substring(0, 1).toUpperCase() + A.substring(1);
     String Bcap = B.substring(0, 1).toUpperCase() + B.substring(1);
     System.out.println(Acap+" "+Bcap);
     
	 }
}
