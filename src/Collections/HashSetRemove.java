package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRemove {

	public static void main(String[] args)
	{
		HashSet<String> h=new HashSet<String>();
		h.add("Sandy");
		h.add("Sekhar");
		
		 Iterator i = h.iterator();
		 
		 while(i.hasNext())
		 {
			if( i.next().equals("Sandy"))
			h.remove("Sandy");
				
		 }
		 System.out.println(h);
	}

}
