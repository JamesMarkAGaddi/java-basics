package org.acumen.training.codes.BankAccountC;

public class BankAccount{
	
	static {
		System.loadLibrary("bank account");
	}

	public native int getNumber(int number) ;
	public native String getName(String person) ;
	public native double getBalance(double balance) ;
	public native void depositCash(double a) ;
}