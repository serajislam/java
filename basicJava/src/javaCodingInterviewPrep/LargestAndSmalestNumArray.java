package javaCodingInterviewPrep;

public class LargestAndSmalestNumArray {

	public static void main(String[] args) {
		
		int[]array = {12,2,1234,90,24,9,301,320,201,10070};
		
		int largestNo = array[0];
		int smallestNo = array[0];
		
		for(int a=1;a<array.length;a++)
		{
			if(array[a]>largestNo)
			{
				largestNo = array[a];
			}
			else if(array[a]<smallestNo)
			{
				smallestNo=array[a];
			}
		}
		
		System.out.println(smallestNo);
		
		System.out.println(largestNo);
	}
	

}
