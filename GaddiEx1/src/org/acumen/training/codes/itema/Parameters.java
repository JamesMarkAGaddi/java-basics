package org.acumen.training.codes.itema;

public class Parameters {
	public static void main(String[] args) {
		double bubble = 867.5309;
		double x = 10.01;
		double y = 20.02;
		printer(x, y);
		printer(x, bubble);
		printer("barack", "obama");
	}

	/**
	 * Prints two doubles.
	 */
	public static void printer(double x, double y) {
		System.out.println("x = " + x + " and y = " + y);
	}

	/**
	 * Prints a single double.
	 */
	public static void printer(double x) {
		System.out.println("x = " + x);
	}

	/**
	 * Prints two strings.
	 */
	public static void printer(String firstName, String lastName) {
		System.out.println("Name: " + firstName + " " + lastName);
	}
}
