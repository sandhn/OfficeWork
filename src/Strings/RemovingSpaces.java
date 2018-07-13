package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingSpaces {

	public static void main(String[] args)
	{
		String str= "I Love My India";
			
		//System.out.println(str.replace(" ", ""));  ---> Using replace function
		
		 char[] s = str.toCharArray();
		 
	        StringBuffer sb = new StringBuffer();
	 
	        for (int i = 0; i < s.length; i++)
	        {
	            if( (s[i] != ' ') )
	            {
	                sb.append(s[i]);
	            }
	        }
	
	        System.out.println(sb);
		 
	
	}

}
