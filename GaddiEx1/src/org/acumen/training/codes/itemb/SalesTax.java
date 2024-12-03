package org.acumen.training.codes.itemb;

public class SalesTax {
	private static final double STATE_TAX_RATE = 0.04;
	private static final double COUNTY_TAX_RATE = 0.02;
	private double itemCost;
	private double stateTax;
	private double countyTax;
	private double totalCost;

	public void computeCost(double itemCost) {
		this.itemCost = itemCost;
		this.stateTax = itemCost * STATE_TAX_RATE;
		this.countyTax = itemCost * COUNTY_TAX_RATE;
		this.totalCost = itemCost + stateTax + countyTax;
	}

	public void displayResults() {
		System.out.println("Cost of the item: $" + itemCost);
		System.out.println("State tax: $" + stateTax);
		System.out.println("County tax: $" + countyTax);
		System.out.println("Total cost: $" + totalCost);

	}
}
