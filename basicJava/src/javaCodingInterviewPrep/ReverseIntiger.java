package javaCodingInterviewPrep;

public class ReverseIntiger {

	public static void main(String[] args) {
		
		int a=12345;
		int rev = 0;
		//First approch using proper algo
		while(a!=0)
		{
			rev= rev*10 + a%10;
			a=a/10;
		}
	
		System.out.println(rev);
		
		int c=123456789;
		StringBuffer sb = new StringBuffer(String.valueOf(c)).reverse();
		System.out.println(sb);

	}

}
