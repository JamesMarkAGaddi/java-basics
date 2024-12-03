package org.acumen.training.codes.test;

import org.acumen.training.codes.Kiosk;

public class TestKiosk {

	public static void main(String[] args) {
		Kiosk ks = new Kiosk();
		ks.computeCharge(0, 2000);
		ks.printAmount();

		ks.computeCharge(0, 100);
		ks.printAmount();

		ks.computeCharge(50, 100);
		ks.printAmount();
		
		ks.computeCharge(200, 50);
		ks.printAmount();

		ks.computeCharge(300, 100);
		ks.printAmount();

	}

}
