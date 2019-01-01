package javaCode;

public class JunkRemove {

	public static void main(String[] args) {
		
		String remJunk = "@abc#@$123**()&&&89";
		
		String WithoutJunk= remJunk.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(WithoutJunk);
	}

}
