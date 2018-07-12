package Collections;

import java.util.ArrayList;

public class RemoveDups {

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Sachin");
		al.add("Tendulkar");
		al.add("12");
		al.add("12");
		System.out.println("before removing duplicates:"+al);
		 for(int i=0;i<al.size()-1;i++)
		 {
			 if(al.get(i)==al.get(i+1))
			 {
				 al.remove(i);
			 }
		 }
		 System.out.println("After removing duplicates:"+al);
	}

}
