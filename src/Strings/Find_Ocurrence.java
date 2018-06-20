package Strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Find_Ocurrence {

	/*public static void main(String[] args) 
	{
		System.out.println("Enter a String");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count = 0;
		char[] arr = s.toCharArray();
		HashSet h=new HashSet<String>();
		
		for(int i=0;i<arr.length;i++)
		{
			h.add(arr[i]);
		}
		for(int i=0;i<h.size();i++)
		{
			if(h.equals(arr[i]))
			{
				count++;
			}
			System.out.println(count);
		}
	}*/
	public static void main(String[] args) 
	{
		String str = "Programming";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char ch : str.toCharArray())
		{
			if (map.containsKey(ch)) 
			{
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}

		System.out.println(map);
	
	}
}
	

	



