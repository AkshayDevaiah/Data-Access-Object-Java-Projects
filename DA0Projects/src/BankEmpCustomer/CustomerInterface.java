package BankEmpCustomer;

public interface CustomerInterface {
	void checkBal(Customer c);
	void deposit(Customer c);
	void withdraw(Customer c);
	void transaction(Customer c);
	void pinGeneration(Customer c);
	void choice(Customer c);
}
