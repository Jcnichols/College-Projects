
public class InternationalDivision extends Division{
	public String country;
	public String language;
	
	public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
		this.divisionName = divisionName;
		this.accountNumber = accountNumber;
		this.country = country;
		this.language = language;
	}
	
	@Override
	public void display() {
		System.out.println("International Division: " + "Division Name: " + divisionName + " Account Number:" + accountNumber + " Country: " + country + " Language: " + language + "\n");
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}
