package javaCode;

public class RivString {

	public static void main(String[] args) {
		
		String name = "NUMAYLA";
		int len = name.length();
		String rev = "";
		
		for(int a=len-1;a>=0;a--)
		{
			rev=rev+name.charAt(a);
		}
		System.out.println(rev);
		
		StringBuffer sb =  new StringBuffer(name);
		System.out.println(sb.reverse());
	}
	
}
