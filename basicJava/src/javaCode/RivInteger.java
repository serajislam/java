package javaCode;

public class RivInteger {

	

	public static void main(String[] args) {
		
		int a = 7654321;
		int rev = 0;
		
		while(a!=0)
		{
			rev = rev*10 + a%10;
			a=a/10;
		}
		
		System.out.println(rev);
		
		int c = 1234567;
		StringBuffer sb = new StringBuffer(String.valueOf(c)).reverse();
		System.out.println(sb);
	}
	

}
