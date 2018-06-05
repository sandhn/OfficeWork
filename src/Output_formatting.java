import java.util.Scanner;

public class Output_formatting {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] s1=new String[3];
		int[] x= new int[3];
		for(int i=0;i<3;i++)
		{	
			System.out.println("Enter a String followed a by an integer");
             s1[i]=sc.next();
             if(s1[i].length()>10)
             {
             String cutname = s1[i].substring(0	, 10);
             s1[i]=cutname;
             }
            x[i]=sc.nextInt();
            if(x[i]<0 || x[i]>999)
            {
            	System.out.println("Please enter a value between 0 to 999");
            	 x[i]=sc.nextInt();
            }
            
        }
		System.out.println("================================");
		for(int i=0;i<3;i++)
		{	
            String u;
            u=String.format("%03d", x[i]);
            System.out.println(s1[i]+"     "+u);
           
        }
		System.out.println("================================");
		
	}

}
