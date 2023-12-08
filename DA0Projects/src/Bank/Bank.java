package Bank;

public class Bank {
	private long accNum;
	private String accName;
	private int pin;
	private int bal=0;
	Bank(String accName){
		this.accName=accName;
	}
	public Bank() {
	}
	void setAccNum(long accNum) {
		this.accNum=accNum;
	}
	void setPin(int pin) {
		this.pin=pin;
	}
	int getPin() {
		return this.pin;
	}
	void setBal(int bal) {
		this.bal=bal;
	}
	int getBal() {
		return this.bal;
	}
	long getAccNum() {
		return this.accNum;
	}
	String getAccName() {
		return this.accName;
	}
}
