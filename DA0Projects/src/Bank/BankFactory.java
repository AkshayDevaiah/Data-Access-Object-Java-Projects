package Bank;

public class BankFactory {
	public static BankInterface createInstance(int choice) {
		if(choice==1) {
			return new BankNewCustomerimplmplementation();
		}
		else if(choice==2) {
			return new BankOldCustomerImplementation();
		}
		else {
			return null;
		}	
	}
}
