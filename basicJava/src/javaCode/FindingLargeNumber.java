package javaCode;

public class FindingLargeNumber {

	public static void main(String[] args) {
		
		int []array={10,20,30,40,50,60};
		
		
		int lNo = array[0];
		int sNo = array[0];
		
		for(int a=1;a<array.length;a++)
		{
			if(array[a]>lNo)
			{
				//to find second largest no 
				//sNo=lNo;
				lNo=array[a];
			}
			else if(array[a]<sNo)
			{
				//Need to change to find second largest no 
				//(array[a]>sNo)
				
				sNo=array[a];
			}
			
		}
		
		System.out.println(lNo);
		System.out.println(sNo);
	}

}
