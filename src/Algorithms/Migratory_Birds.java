package Algorithms;

import java.util.HashMap;
import java.util.HashSet;

public class Migratory_Birds
{
	public static void main(String[] args) 
	{
		int birds[] = { 1 ,4 ,4 ,4 ,5, 3 ,1,8};
		 int count=0;
		HashMap<Integer, Integer> hm=new HashMap<Integer , Integer>();
		
		HashSet<Integer> h= new HashSet<Integer>();
		
		for(int i=0;i<birds.length;i++)
		{
			if(h.add(birds[i]))
			{
			count++;
			}
		}
		System.out.println("Number of different type of birds are :"+count);
		
		for(int i=0;i<birds.length;i++)
		{
			if(hm.containsKey(birds[i]))
			{
				int val=hm.get(birds[i]);
				hm.put(birds[i], val+1);
			}
			else
			{
				hm.put(birds[i], 1);
			}
			
		}
		System.out.println(hm);
	}
	
}
