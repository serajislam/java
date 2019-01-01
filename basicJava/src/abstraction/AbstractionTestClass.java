package abstraction;

public class AbstractionTestClass {

	public static void main(String[] args) {
		
		
		SouthEastBank sb = new SouthEastBank();
		sb.credit();
		sb.debit();
		sb.moneyTransfer();
		sb.carLoan();
		sb.homeLoan();
		sb.personalLoan();
		System.out.println("The min balance is "+BangladeshBank.minBalance);

	}

}
