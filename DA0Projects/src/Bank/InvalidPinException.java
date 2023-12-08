package Bank;

public class InvalidPinException extends Exception{
	public String getMessage() {
		return "Wrong pin or account number,re try";
		
	}
}
