package org.acumen.training.codes.itemb;

public class TestSalesTax {
	public static void main(String[] args) {
		SalesTax tax = new SalesTax();
		tax.computeCost(100.0);
		tax.displayResults();
		System.out.println();
		tax.computeCost(250.0);
		tax.displayResults();
	}
}
