package org.acumen.training.codes.modifiers;

public class Accounts {

	public String accountId;
	String accountHolder; // automatic private
	protected double amount;
	private String guarantor;

	public void seAccounts() {	
	}

	String getAccountHolder() {
		return accountHolder;
	}

	public void accessResources() {
		accountHolder = "";
		getAccountHolder();
		amount = 300.00;
		depositAmount();
		guarantor = "James";
		setGuarantor();
	}

	protected void depositAmount() {

	}

	private void setGuarantor() {
		// can be oly accessed within the class
	}
}
