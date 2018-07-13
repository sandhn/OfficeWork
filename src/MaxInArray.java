import java.util.Arrays;

public class MaxInArray {

	/*public static void main(String[] args) 
	{
		int[] list = { 15, 24, 48, 21, 43, 11, 79, 93 };
		
		int max1=0;
		for(int i=0;i<list.length-1;i++)
		{
			if(list[i]>list[i+1])
				max1=list[i];
			else
				max1=list[i+1];
		}
		System.out.println("Max value is:"+max1);
	}*/
	

	/*public static void main(String[] args) {

		int list[] = { 15, 24, 48, 21, 43, 11, 79, 93 };

		int maxOne = 0;
		int maxTwo = 0;
		for (int n : list) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}

		}
		System.out.println("Maxone:"+maxOne+" MAxtwo:"+maxTwo);

	}*/
	/*public static void main(String[] args) {
		int list[] = { 15, 24, 48, 21, 2, 16, 100 };
		int a;
		for (int i = 0; i < list.length; i++) {
			if (list[0] < list[i]) {
				int x = list[0];
				list[0] = list[i];
				list[i] = x;
			}

			if ((list[1] < list[i]) ) {
				list[1] = list[i];
			}

		}
		System.out.println("Max number=" + list[0] + " & Second Max number=" + list[1]);
	}*/
    public static void main(String[] args) {
        
        int arr[] ={1,60};
        
        int first,second;
        int l=arr.length;
        
        first=second=Integer.MIN_VALUE;
        
        for(int i=0;i<l;i++){
               
               if(arr[i]>first){
                     second=first;
                     first=arr[i];
               }
               else if(arr[i]>second && arr[i]!=first){
                     second=arr[i];
               }
        }
        
        System.out.println(" First : "+first+" Second : "+second);

 }



}
