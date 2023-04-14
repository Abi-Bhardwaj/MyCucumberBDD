package awesomecucumber.domainObjects;

public class BillingDetails {
	
	private String billingLastName;
	private String billingAddressOne;
	private String billingCity; 
	private String billingState;
	private String billingZip;
	private String billingEmail;
	
	public BillingDetails(String billingFistName, String billingLastName, String billingAddressOne, 
							String billingCity, String billingState, String billingZip, 
							String billingEmail) {
		this.billingLastName = billingLastName;
		this.billingAddressOne = billingAddressOne;
		this.billingCity = billingCity;
		this.billingState = billingState;
		this.billingZip = billingZip;
		this.billingEmail = billingEmail;
		this.billingFistName = billingFistName;
	}
	
	
	
	private String billingFistName;
	public String getBillingFistName() {
		return billingFistName;
	}
	public void setBillingFistName(String billingFistName) {
		this.billingFistName = billingFistName;
	}
	public String getBillingLastName() {
		return billingLastName;
	}
	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}
	public String getBillingAddressOne() {
		return billingAddressOne;
	}
	public void setBillingAddressOne(String billingAddressOne) {
		this.billingAddressOne = billingAddressOne;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	public String getBillingState() {
		return billingState;
	}
	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}
	public String getBillingZip() {
		return billingZip;
	}
	public void setBillingZip(String billingZip) {
		this.billingZip = billingZip;
	}
	public String getBillingEmail() {
		return billingEmail;
	}
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}
	
	
	

}
