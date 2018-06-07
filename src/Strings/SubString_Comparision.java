package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubString_Comparision {

	public static void main(String[] args) 
	{
		System.out.println("Enter a String:");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        System.out.println("Enter an Integer:");
        Scanner inp = new Scanner(System.in);
        int ip = inp.nextInt();
        
        List<String> str= new ArrayList<String>();
        
        for(int i=0;i<(s.length()-ip+1);i++)
        {
        	str.add( s.substring(i, i+ip));
        	
        }
        Collections.sort(str);
        System.out.println(str.get(0));
        System.out.println(str.get(str.size()-1));

	}

}
