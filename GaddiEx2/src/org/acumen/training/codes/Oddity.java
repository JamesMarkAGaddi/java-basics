package org.acumen.training.codes;

public class Oddity {
	
	public static boolean allDigitsOdd(int num) {

		while (num > 0) {
			if (num % 10 == 0) {
				return false;
			}
			num = num / 10;
		}
		return true;

	}
}
