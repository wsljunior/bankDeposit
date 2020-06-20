package entities;

public class Bank {
	private String holder;
	private int accountNumber;
	private double balance;

	public Bank(String holder, int accountNumber, double initialdeposit) {

		this.holder = holder;
		this.accountNumber = accountNumber;
		deposit(initialdeposit);
	}

	public Bank(String holder, int accountNumber) {
		this.holder = holder;
		this.accountNumber = accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double montant) {
		this.balance -= montant + 5.0;
	}

	public void deposit(double montant) {
		this.balance += montant;
	}

	public void information() {
		System.out.println("Account: " + getAccountNumber() + ", Holder: " + getHolder() + ", Balance: " + getBalance());
	}

}
