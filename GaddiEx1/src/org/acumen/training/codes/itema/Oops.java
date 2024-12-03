package org.acumen.training.codes.itema;

public class Oops {
	public static void main(String[] args) {
		int a = 7, b = 42;
		int smaller = minimum(a, b);
		if (smaller == a) {
			System.out.println("a is the smallest!");
		} else if (smaller == b) {
			System.out.println("b is the smallest!");
		}
	}

	/**
	 * Returns the smaller of two integers.
	 *
	 * @param a the first integer
	 * @param b the second integer
	 * @return the smaller integer
	 */
	public static int minimum(int a, int b) {
		return (a < b) ? a : b;
	}
}
