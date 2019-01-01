package javaCode;

public class StringSwap {

	public static void main(String[] args) {
		
		String a = "Numayla";
		String b = "Islam";
		
		a=a+b;
		b=a.replace(b, "");
		a=a.replace(b, "");
		
		System.out.println(a);
		System.out.println(b);

	}

}
