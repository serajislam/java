package encaptulation;

public class EncConcept {

	private String empName;
	private int empID;
	private String empEmail;
	private String empPhoneNo;
	
	
	
	public static void main(String[] args) {
		
		EncConcept encConcept = new EncConcept();
		
		encConcept.setEmpName("Seraj Islam");
		encConcept.setEmpID(1234567890);
		encConcept.setEmpEmail("serajislam@gmail.com");
		encConcept.setEmpPhoneNo("929-395-2159");
		
		
		System.out.println("The Emp name is "+encConcept.getEmpName());
		System.out.println("The Emp ID no is "+encConcept.getEmpID());
		System.out.println("The Emp email is "+encConcept.getEmpEmail());
		System.out.println("The Emp phone no is "+encConcept.getEmpPhoneNo());
		

	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(String empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}

}
