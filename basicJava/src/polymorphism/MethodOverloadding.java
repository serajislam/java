package polymorphism;

public class MethodOverloadding {

	public static void main(String[] args) {
		

		MethodOverloadding mol = new MethodOverloadding();
		mol.add(10, 20);
		mol.add(10, 20, 20);
		mol.add(50.99, 50);
		mol.name("Alayaan", "Islam");
		
	}

	
	public void add(int a, int b)
	{
		int twoParam = a+b;
		System.out.println(" int a & b addition is "+twoParam);
		
	}
	
	public void add(double a, int b)
	{
		double intDouble = a+b;
		System.out.println(" int & double addition is "+intDouble);
		
	}
	
	public void add(int a, int b,int c)
	{
		int threeParam = a+b+c;
		
		System.out.println(" int a, b & c addition is "+threeParam);
	}
	
	public void name(String firstName, String lastName)
	{
		String fullName = firstName+" " +lastName;
		
		System.out.println(" The full name is "+fullName);
		
	}
}
