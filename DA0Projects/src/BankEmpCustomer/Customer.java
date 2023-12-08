package BankEmpCustomer;

public class Customer {
	private int customerAccNum;
	private String customerName;
	private double customerAccBal;
	private String customerPin;
	private int customerPhoneNum;
	
	public Customer() {
	}
	public Customer(int customerAccNum, String customerName, double customerAccBal, String customerPin,
			int customerPhoneNum) {
		this.customerAccNum = customerAccNum;
		this.customerName = customerName;
		this.customerAccBal = customerAccBal;
		this.customerPin = customerPin;
		this.customerPhoneNum = customerPhoneNum;
	}
	public int getCustomerAccNum() {
		return customerAccNum;
	}
	public void setCustomerAccNum(int customerAccNum) {
		this.customerAccNum = customerAccNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerAccBal() {
		return customerAccBal;
	}
	public void setCustomerAccBal(double customerAccBal) {
		this.customerAccBal = customerAccBal;
	}
	public String getCustomerPin() {
		return customerPin;
	}
	public void setCustomerPin(String customerPin) {
		this.customerPin = customerPin;
	}
	public int getCustomerPhoneNum() {
		return customerPhoneNum;
	}
	public void setCustomerPhoneNum(int customerPhoneNum) {
		this.customerPhoneNum = customerPhoneNum;
	}
	
}
