package org.acumen.training.codes.greeting;

public class Product {

	
	public int item;
	public double price$; // tama naman pero engk
	public double priceInDollars; 
	
	//default valuesS
	public boolean isExpired;
	public String name;
	
	//temporary
	public void createLocalScope() { //method scope
		int counterX; // garbage means need ng initial value kapag local variable
		int counter = 0;
		System.out.println(counter);
	}
}
