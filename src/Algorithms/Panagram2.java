package Algorithms;

public class Panagram2 {

	
	public static boolean checkPangram (String str)
    {
            // Create a hash table to mark the 
          // characters present in the string
          // By default all the elements of 
          // mark would be false.
          boolean[] mark = new boolean[26];
      
          // For indexing in mark[]
          int index = 0;
      
          // Traverse all characters
          for (int i = 0; i < str.length(); i++)
          {
              // If uppercase character, subtract 'A'
              // to find index.
              if (str.charAt(i)>= 'A' && 
                      str.charAt(i) <= 'Z')
                           
                  index = str.charAt(i) - 'A';
             
      
                  // If lowercase character, subtract 'a'
                  // to find index.
              else if(str.charAt(i)>='a' && 
                          str.charAt(i) <= 'z')
                               
                  index = str.charAt(i) - 'a';
             
              // Mark current character
              mark[index] = true;
    }

    // Return false if any character is unmarked
    for (int i = 0; i <= 25; i++)
        if (mark[i] == false)
            return (false);

    // If all characters were present
    return (true);
}

      public static void main(String[] args) {
            
            String s="Hi I am panagram but cdefghijklmnopqrstuvwxyz";
            String s1="Hello";
            if (checkPangram(s) == true)
            System.out.println(s + " :-is a pangram.");
        else
            System.out.println(s+ ":- is not a pangram.");
            if (checkPangram(s1) == true)
                System.out.println(s1 + " :-is a pangram.");
            else
                System.out.println(s1+ ":- is not a pangram.");
            char h1='A';
            char h2='C';
            
            System.out.println(h2-h1);

      } 


}
