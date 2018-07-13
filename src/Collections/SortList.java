package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.TreeSet;

public class SortList {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Idly");
		al.add("Sambar");
		al.add("Vada");
		al.add("Chatny");
		al.add("Vada");
		
		//Collections.sort(al);  -->One Method
		TreeSet<String> h=new TreeSet<String>(al);
		
		System.out.println(h);

	}

}
