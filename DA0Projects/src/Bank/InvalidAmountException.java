package Bank;

public class InvalidAmountException extends Exception{
	public String getMessage() {
		return "Withdarwal amount is more than available balance,Insufficient balance";
		
	}
}
