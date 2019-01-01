package javaCode;

public class FindingLargeNumber {

	public static void main(String[] args) {
		
		int []array={1,2,90,34,20,11098,243,398018,27289,1111,287651,};
		
		int largestNo = array[0];
		
		for(int a = 1;a<array.length;a++)
		{
			if(array[a]>largestNo)
			{
				largestNo = array[a];
			}
		}
		System.out.println(largestNo);

	}

}
