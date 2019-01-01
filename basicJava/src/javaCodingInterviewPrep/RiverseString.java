package javaCodingInterviewPrep;

public class RiverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";
		
		//First approach using for loop
		int len = s.length();
		System.out.println(len);
		
		String rev="";
		
		for(int a=len-1;a>=0;a--)
		{
			rev= rev+s.charAt(a);
		}
		System.out.println(rev);
		
		// Second approach using StringBuffer Class
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

	}

}
