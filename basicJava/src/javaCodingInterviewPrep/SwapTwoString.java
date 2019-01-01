package javaCodingInterviewPrep;

public class SwapTwoString {

	public static void main(String[] args) {
		
		String a ="Hello";
		String b ="World";
		
		System.out.println("Before swaping the value of a is "+a);
		System.out.println("Before swaping the value of b is "+b);
		
		//using substring method
//		a=a+b;// HelloWorld
//		b=a.substring(0, a.length()-b.length());
//		a=a.substring(b.length());
		
		//using replace method
		a=a+b;
		b=a.replace(b, "");
		a=a.replace(b, "");
		
		System.out.println("After swaping the value of a is "+a);
		System.out.println("After swaping the value of b is "+b);
		
		
		

	}

}
