package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class list {

	public static void main(String[] args) 
	{
		//If a particular element is present
		ArrayList<String> a= new ArrayList<String>();
		
		a.add("Test");
		a.add("Test2");
		a.add("Test");
		a.add("Test3");
		a.add("Test3");
		
		int count=0; 
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)=="Test")
			count++;
		}
		if(count>0)
			System.out.println("Element present");
		else
			System.out.println("Element Not present");
		
		//To print the duplicates
		
		HashSet<String> h= new HashSet<String>();
		System.out.println("Duplicate Elements are:");
		for(int i=0;i<a.size();i++)
		{
			
			if(!h.add(a.get(i)))
			{
				System.out.println(a.get(i));
			}
		}
	}

}
