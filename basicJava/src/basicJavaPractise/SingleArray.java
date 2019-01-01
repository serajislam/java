package basicJavaPractise;

import java.util.Arrays;

public class SingleArray {

	public static void main(String[] args) {
		
		int [] sinArray = {2,3,1,4,5,6,7,8,97,12,21,43,56,30,31,38,91,245,};
		
		//printing length of array
		System.out.println("The length of array is "+sinArray.length);
		
		//printing total no of given array
		System.out.println("Total given array is"+Arrays.toString(sinArray));
		
		for(int a =0;a<sinArray.length;a++)
		{
			System.out.println("The total no of given array is "+sinArray[a]);
		}
		
		//printing largest no from array
		int largest = sinArray[0];
		int smallest = sinArray[0];
		for(int b=1;b<sinArray.length;b++)
		{
			if(sinArray[b]>largest)
			{
				largest = sinArray[b];
			}
			
			//Printing smallest no from Array
			else if(sinArray[b]<smallest)
			{
				smallest = sinArray[b];
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
	}

}
