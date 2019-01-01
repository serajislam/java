package javaCodingInterviewPrep;

public class SwapTwoInteger {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		//using 3rd variable
//		int t;
//		t = x;//5
//		x = y;//10
//		y = t;//5
		
		// Without using 3rd variable
//		x = x+y;//15
//		y = x-y;//5
//		x = x-y;//10
		
//		x = x*y;//50
//		y = x/y;//5
//		x = x/y;
		
		//using Xor operator
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println(x);
		System.out.println(y);
		

	}

}
