package Bank;

public class InvalidOldPinException extends Exception{
	public String getMessage() {
		return "Wrong old pin";
		
	}
}
