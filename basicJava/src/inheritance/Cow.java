package inheritance;

public class Cow extends Animal{
	
	public void eat()
	
	{
		super.eat();
		System.out.println("Cow eats grass");
	}
	
	public void leg()
	{
		super.leg();
		System.out.println("Cow has 4 legs");
	}
	
	public void eye()
	{
		super.eye();
		System.out.println("Cow has two eye");
	}
	
	public void domAnimal()
	{
		System.out.println("Cow is a domestic animal");
	}

}
