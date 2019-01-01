package javaCodingInterviewPrep;

public class MissingNumber {

	public static void main(String[] args) {
		
		int []array = {1,2,4,5,6,7,8,9,10};
		//Math structure
		//1+2+4+5=12
		//1+2+3+4+5=15
		//15-12=3
		//3 is missing 
		
		int sum = 0;
		for(int a=0;a<array.length;a++)
		{
			sum=sum+array[a];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int b=-1;b<=10;b++)
		{
			sum1 = sum1+b;
		}
		
		System.out.println(sum1);
		System.out.println("missing no is "+(sum1-sum));

	}

}
