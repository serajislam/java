package javaCodingInterviewPrep;

public class StringManupulation {

	public static void main(String[] args) {
		
		String st = "The rains have start here selenium";
		String str = "The rains have Start here selenium";
		
		System.out.println(st.length());
		
		System.out.println(st.charAt(10));
		
		System.out.println(st.indexOf('s'));
		
		System.out.println(st.indexOf('s', st.indexOf('s')+9));
		
		System.out.println(st.indexOf("have"));
		 
		System.out.println(st.indexOf("Hello"));
		
		System.out.println(st.equals(str));
		System.out.println(st.equalsIgnoreCase(str));
		
		System.out.println(st.substring(0, 10));
		
		//Trim method in string
		String s = "  Hello  world   ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		String date = "10-20-2018";
		System.out.println(date.replace("-", "/"));
		
		//Split method in string 
		String test = "Hello_Selenium_world";
		String [] testVal = test.split("_");
		for(int a=0;a<testVal.length;a++)
		{
			System.out.println(testVal[a]);
		}
		
		//Concatinate
		String st1= "Hello";
		System.out.println(st1.concat("world"));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		

	}

}
