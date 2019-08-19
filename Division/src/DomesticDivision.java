
public class DomesticDivision extends Division{
	public String state;
	
	public DomesticDivision(String divisionName, int accountNumber, String state) {
		this.divisionName = divisionName;
		this.accountNumber = accountNumber;
		this.state = state;
	}
	
	@Override
	public void display() {
		System.out.println("Domestic Division: " + "Division Name: " + divisionName + " Account Number: " + accountNumber + " State: " + state + "\n");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
