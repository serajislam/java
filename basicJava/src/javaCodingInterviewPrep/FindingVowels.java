package javaCodingInterviewPrep;

import java.util.Scanner;

public class FindingVowels {
	
	public static void main(String[] args) {
		
		System.out.println("Enter some string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] ch = str.toCharArray();
		
		int a= 0;
		
		for(char c:ch)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				a++;
				break;
				
				
			
			}
			
		}
		
		System.out.println("The no of vowel is "+a);
	}

}
