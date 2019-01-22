package javaCode;

public class JunkRemove {

	public static void main(String[] args) {
		
		String junk ="@@@@@NU****M___A##Y!!!L???A///////";
		
		String junkRem = junk.replaceAll("[^a-zA-Z-0-9]", "");
		
		System.out.println(junkRem);
		
	}

}
