package org.acumen.training.codes;

public abstract class CreditAccount {

	protected String accountNum;
	protected String branchName;
	protected double currentBal;
	protected double creditLimit;
	protected double debitInterestRate;
	protected double creditInterestRate;

	public CreditAccount(String accountNumber, String branch, double balance, double creditLim) {
		accountNum = accountNumber;
		branchName = branch;
		currentBal = balance;
		creditLimit = creditLim;
	}

	public abstract void setDebitInterestRate(double newRate);

	public abstract void setCreditInterestRate(double newRate);

	public abstract boolean withdrawCash(double amount);

	public abstract void depositCash(double amount);

	public abstract void addInterest();

	public abstract String getDetails(int accountNumber, String branch, double balance, double creditLimit);
}
