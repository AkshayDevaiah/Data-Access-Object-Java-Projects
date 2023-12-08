package Bank;

public class MinDepositException extends Exception{
	public String getMessage() {
		return "Deposit amount cannot be less than 1";
		
	}
}
