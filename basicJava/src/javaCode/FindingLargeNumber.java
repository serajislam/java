package javaCode;

public class FindingLargeNumber {

	public static void main(String[] args) {
		
		int []array={1,2,-1,90,34,20,11098,243,398018,27289,1111,287651,999999999};
		
		
		int lNo = array[0];
		int sNo = array[0];
		
		for(int a=1;a<array.length;a++)
		{
			if(array[a]>lNo)
			{
				lNo=array[a];
			}
		}
		
		System.out.println(lNo);
	}

}
