package basicJavaPractise;

public class LoopConcept {

	public static void main(String[] args) {
		
		for(int a =0;a<=10;a++)
		{
			System.out.println(" for loop value is "+a);
		}
		
		System.out.println("__________________________________________");
		
		int b = 0;
		
		while(b<=10)
		{
			System.out.println("whilw loop value is " +b);
			b++;
		}
		
		System.out.println("__________________________________________");
		
		int c= 0;
		do
		{
			System.out.println("do while loop value is "+c);
			c++;
		}while(c<=15);

	}

}
