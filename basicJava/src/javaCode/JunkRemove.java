package javaCode;

public class JunkRemove {

	public static void main(String[] args) {
		
		String junk ="@@@@@NU****M__}}}}_A##Y!!!L???A////123456///";
		
		String alphabet = junk.replaceAll("[^a-zA-Z]", ""); 
		
		String numeric = junk.replaceAll("[^0-9]", ""); 
		
		
		System.out.println(alphabet);
		System.out.println(numeric);
		 
	}

}
