package basicJavaPractise;

public class VariableAndDataType {
	
	//instancce variable 
	 short sh = 10;
	 byte bt = 20;
	 int in = 30;
	 long ln = 40;
	 float fl = 19.99f;
	 double dl = 20.111;
	 char ch = 'A';
	 boolean bl = true;
	 
	 //Local variable
	 public void localVariable()
	 {
		 short sh = 20;
		 byte bt = 30;
		 int in = 40;
		 long ln = 50;
		 float fl = 39.99f;
		 double dl = 40.111;
		 char ch = 'B';
		 boolean bl = true;
		 
		 System.out.println("Local variable short is " +sh);
		 System.out.println("Local variable byte is " + bt);
		 System.out.println("Local variable int is " +  in);
		 System.out.println("Local variable long is " + ln);
		 System.out.println("Local variable float is " + fl);
		 System.out.println("Local variable double is " + dl);
		 System.out.println("Local variable char is " + ch);
		 System.out.println("Local variable boolean is " + bl);
	 }
	  
	 //stattic variable
	 
	static short s = 10;
	static byte b = 20;
	static int i = 30;
	static long l = 40;
	static float f = 19.99f;
	static double d = 20.111;
	static char c = 'A';
	static boolean bn = true;
	
	public static void main(String[]args)
	{
		
		
		VariableAndDataType vdt = new VariableAndDataType();
		
		 System.out.println("instancce variable short is " + vdt.sh);
		 System.out.println("instancce variable byte is " + vdt.bt);
		 System.out.println("instancce variable int is " + vdt.in);
		 System.out.println("instancce variable long is " + vdt.ln);
		 System.out.println("instancce variable float is " + vdt.fl);
		 System.out.println("instancce variable double is " + vdt.dl);
		 System.out.println("instancce variable char is " + vdt.ch);
		 System.out.println("instancce variable boolean is " + vdt.bl);
		 
		 System.out.println("_________________________________________________");
		 
		 vdt.localVariable();
		 
		 System.out.println("_________________________________________________");
		 
		 System.out.println("static variable short is " +s);
		 System.out.println("static variable byte is " + b);
		 System.out.println("static variable int is " +  i);
		 System.out.println("static variable long is " + l);
		 System.out.println("static variable float is " + f);
		 System.out.println("static variable double is " + d);
		 System.out.println("static variable char is " + c);
		 System.out.println("static variable boolean is " + bn);
		 
		 
		 
		 
	}

}
