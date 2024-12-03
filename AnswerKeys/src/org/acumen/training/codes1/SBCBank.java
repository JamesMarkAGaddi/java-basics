package org.acumen.training.codes1;

public class SBCBank {
	public double account;
	
	public boolean deposit(double amount) {
		if (amount<0) {
			return false;
		}
		
		account += amount;
		return true;		
	}
	
	public boolean withdraw(double amount) {
		if ( account-amount >= 0) {
			account-=amount;
			return true;
		}
		return false;
	}
}
