package org.acumen.training.codes;

public class GeneralMethods {

	public void getPowersOfTwo() {
		byte startExp = 2;
		byte sentinel = 10;
		short num = 1;

		for (byte counter = 1; counter <= sentinel; counter++) {
			num = (short) (num * startExp);
			System.out.print(num + " ");
		}
	}

	public void pingAlarm(int times) {
		for (int counter = 1; counter <= times; counter++) {
			System.out.println("Alarm!");
		}

	}

	public int computeSum100() {
		byte maxNum = 100;
		short sum = 0;

		for (byte counter = 1; counter <= maxNum; counter++) {
			sum = (short) (sum + counter);
		}
		return sum;

	}

	public int getSumRange(int min, int max) {
		int sum = 0;

		for (; min <= max; min++) {
			sum = sum + min;
		}
		return sum;

	}

	public int getMaxTwo(int num1, int num2) {
		if (num1 < num2) {
			return num2;
		}
		return num1;

	}

	public boolean isLargerValue(double num1, double num2) {
		if (num1 > num2) {
			return true;
		}
		return false;

	}

	public boolean isEvenlyDivisible(int num1, int num2) {
		if ((num1 % num2) == 0 || (num2 % num1) == 0) {
			return true;
		}
		return false;
	}
}
