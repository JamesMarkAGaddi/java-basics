package org.acumen.training.codes.test;

import org.acumen.training.codes.GeneralMethods;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods gen = new GeneralMethods();
		gen.getPowersOfTwo();

		System.out.println();
		gen.pingAlarm(8);

		short sum = (short) gen.computeSum100();
		System.out.println(sum);

		int sum2 = gen.getSumRange(1, 10);
		System.out.println(sum2);

		int maxNum = gen.getMaxTwo(12, 32);
		System.out.println(maxNum);

		boolean isLarger = gen.isLargerValue(12, 32);
		System.out.println(isLarger);

		boolean isDivisible = gen.isEvenlyDivisible(64, 128);
		System.out.println(isDivisible);
	}
}
