package javaCode;

import java.util.Arrays;

public class SortAscAndDescNo {

	public static void main(String[] args) {
		
		int []numbers = {100,10,200,20,300,30};
		
		int len=numbers.length;
		
		Arrays.sort(numbers);
		for(int i= 0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		for(int j=len-1;j>=0;j--)
		{
			System.out.println(numbers[j]);
		}

	}

}
