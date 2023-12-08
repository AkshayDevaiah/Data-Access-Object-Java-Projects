package Bank;

public class MaxDepositException extends Exception{
	public String getMessage() {
		return "Deposit amount cannot exceed 10000";
	}
}
