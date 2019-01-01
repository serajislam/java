package basicJavaPractise;

public class IfElseStatement {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 15;
		
		if(a>b)
		{
			System.out.println(" A is greater than B");
		}
		
		else if(a==b)
		{
			System.out.println(" A<B");
		}
		else if(a<=b)
		{
			System.out.println(" A<=B");
		}
		
		else if(a>=b)
		{
			System.out.println(" A>=B");
		}
		else
		{
			System.out.println(" A is less than B");
		}
	}

}
