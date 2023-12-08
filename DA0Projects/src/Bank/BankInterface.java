package Bank;

public interface BankInterface {
	Bank createAccount(Bank ref);
	void deposit(Bank ref);
	void withdraw(Bank ref);
	void checkBalance(Bank ref);
	boolean updatePin(Bank ref);
	boolean validate(Bank ref);
	int choice();
}
