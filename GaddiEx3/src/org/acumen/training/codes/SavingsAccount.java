package org.acumen.training.codes;

public abstract class SavingsAccount {

	protected String accountNum;
	protected String branchName;
	protected double currentBal;
	protected static double interestRate;

	public SavingsAccount(String accountNumber, String branch, double balance) {
		accountNum = accountNumber;
		branchName = branch;
		currentBal = balance;
	}

	public abstract void setInterestRate(double newRate);

	public abstract boolean withdrawCash(double amount);

	public abstract void depositCash(double amount);

	public abstract void addInterest();

	public void getDetails() {
		System.out.println(accountNum);
		System.out.println(branchName);
		System.out.println(currentBal);
		
	}
}
