package org.acumen.training.codes;

public class Kiosk {

	private double prevBal;
	private double addCharge;
	private double newBal;
	private double interest;
	private double minPay;
	private static final double INTEREST_RATE = 0.02;
	private static final double MIN_PAY_RATE = 0.20;
	private static final double MIN_PAY_AMOUNT = 50.0;
	private static final double MAX_PAY_AMOUNT = 300.0;

	public void computeCharge(double prevBalance, double addChg) {

		prevBal = prevBalance; // or we can use the keyword this
		addCharge = addChg;

		double charge = prevBal + addChg;
		computeInterest(prevBal, charge);

	}

	private void computeInterest(double prevBal, double charge) {
		
		if (prevBal > 0) {
			interest = charge * INTEREST_RATE;
		} else {
			interest = 0;
		}
		computeNewBal(charge, interest);
	}

	private void computeNewBal(double charge, double interest2) {

		newBal = charge + interest;
		computeMinPay(newBal);

	}

	private void computeMinPay(double newBal) {

		if (newBal < 50) {
			minPay = newBal;
		} else if (newBal >= MIN_PAY_AMOUNT && newBal <= MAX_PAY_AMOUNT) {
			minPay = MIN_PAY_AMOUNT;
		} else {
			minPay = newBal * MIN_PAY_RATE;
		}

	}

	public void printAmount() {
		char dollar = 0x24;

		System.out.println("CS CARD International Statement");
		System.out.println("===============================");
		System.out.println();
		System.out.println("Previous Balance:\t" + dollar + prevBal);
		System.out.println("Additional Charges:\t" + dollar + addCharge);
		System.out.println("Interest:\t\t" + dollar + interest);
		System.out.println();
		System.out.println("New Balance:\t\t" + dollar + newBal);
		System.out.println();
		System.out.println("Minimum Payment:\t" + dollar + minPay);

	}
}
