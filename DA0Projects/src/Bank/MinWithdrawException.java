package Bank;

public class MinWithdrawException extends Exception{
	public String getMessage() {
		return "Withdrawal amount cannot be less than 100";
		
	}
}
