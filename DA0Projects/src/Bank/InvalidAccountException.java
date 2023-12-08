package Bank;

public class InvalidAccountException extends Exception{
	public String getMessage() {
		return "Wrong Account Number";	
	}
}
