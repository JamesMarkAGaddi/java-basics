/* 
	Description: This program will perform different fraction functions
	Author: James Mark A. Gaddi
	Date: September 20, 2024
*/
package org.acumen.training.codes.itemg;

class Fraction {
	public int numerator;
	public int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	/*
	 * This will display the outputs in fraction form
	 */
	public void printRational() {	
		System.out.println(numerator + "/" + denominator);
	}
	/*
	 * This accepts the 2 fractions and adds them
	 */
	public Fraction add(Fraction fraction) {
		int newNumerator = this.numerator * fraction.denominator 
							+ this.denominator * fraction.numerator;
		int newDenominator = this.denominator * fraction.denominator;

		return new Fraction(newNumerator, newDenominator);
	}
	/*
	 * This accepts the 2 fractions and multiplies them
	 */
	public Fraction multiply(Fraction fraction) {
		int newNumerator = this.numerator * fraction.numerator;
		int newDenominator = this.denominator * fraction.denominator;

		return new Fraction(newNumerator, newDenominator);
	}
	/*
	 * This returns if the first fraction is greater than the second
	 */
	public boolean greaterEqual(Fraction fraction) {
		int product1 = this.numerator * fraction.denominator;
		int product2 = this.denominator * fraction.numerator;
		
		if ( product1 > product2 ) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
	}
}
