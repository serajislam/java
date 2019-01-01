package javaCodingInterviewPrep;

public class RemoveJunk {

	public static void main(String[] args) {
		
		
		String s = "@@## Selenium &&&& 07631267";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
