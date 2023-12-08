package BankEmpCustomer;

public class BankFactory {
	public static CustomerInterface customerLogic() {
		return new CustomerImplementation();
	}
	public static EmployeeInterface empLogic() {
		return new EmployeeImplementation();
	}
}
