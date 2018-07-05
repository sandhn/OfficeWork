package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		
		 ArrayList<String>alphabet = new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
		 
	        //alphabet.remove(0);
	        Scanner sc = new Scanner(System.in);
	        
	        String sentence = sc.nextLine().toLowerCase();
	        
	        for(int i=0;i<sentence.length();i++)
	        {
	            if(!alphabet.isEmpty())
	            {
	                alphabet.remove(""+sentence.charAt(i));
	            }
	            else
	            {
	                break;
	            }
	        }
	        
	        System.out.println(alphabet.isEmpty()?"pangram":"not pangram");                                       
	    }

}
