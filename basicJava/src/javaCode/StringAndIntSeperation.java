package javaCode;

public class StringAndIntSeperation {

	public static void main(String[] args) {
		
		String mixString = "Java 1234 interview 567 questions 89";
		String alphabet = "";
		String numeric = "";
		
		
		for(int i = 0;i<mixString.length();i++)
		{
			char ch = mixString.charAt(i);
			if(Character.isDigit(ch))
			{
				numeric = numeric+ch;
			}
			else
			{
				alphabet=alphabet+ch;
			}
		}

		System.out.println(alphabet);
		System.out.println(numeric);
	}

}
