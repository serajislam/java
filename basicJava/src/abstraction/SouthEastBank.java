package abstraction;

public class SouthEastBank implements BangladeshBank {

	public void credit() {
		
		System.out.println("Minimum credit must be 1000  or above");

	}

	public void debit() {
		
		System.out.println("You can withdraw 1000 max per day ");

	}

	public void moneyTransfer() {
		
		System.out.println("Max transfer amount is 500 per day");

	}

	public void carLoan() {
		
		System.out.println("Min car loan is 5000");

	}

	public void homeLoan() {

		System.out.println("Min home loan is 10000");
	}

	public void personalLoan() {
		
		System.out.println("Max personal is 8000");

	}

}
