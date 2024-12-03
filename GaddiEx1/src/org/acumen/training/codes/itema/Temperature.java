package org.acumen.training.codes.itema;

public class Temperature {
	public static void main(String[] args) {
		double tempF = 98.6;
		double tempC = ftoc(tempF);
		System.out.println("Body temp in C is: " + tempC);
	}

	/**
	 * Converts Fahrenheit to Celsius.
	 *
	 * @param tempF temperature in Fahrenheit
	 * @return temperature in Celsius
	 */
	public static double ftoc(double tempF) {
		return (tempF - 32) * 5 / 9;
	}
}
