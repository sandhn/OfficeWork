package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintingDups {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Idly");
		al.add("Idly");
		al.add("Vada");
		al.add("Vada");
		int count=0;
		int j=0;
		String[] s=new String[4];
		HashSet<String> h=new HashSet<String>();
		for(int i=0;i<al.size();i++)
		{
			
			if(!h.add(al.get(i)))
			{
				count++;
				s[j]=al.get(i);
				j++;
			}
			
			
		}
		if(count>0)
		{
			System.out.println("Contains Dups");
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
		}
		else
			System.out.println("Does not Contains Dups");
		
	}

}
