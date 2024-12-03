package org.acumen.training.codes;

public record Statistics(int... data) {

	public void computeData() {
		System.out.printf("Data: ");
		for (int value : data) {
			System.out.print(value + " ");
		}
		System.out.println();

		System.out.println("Mean: " + getMean());
		System.out.println("Geometric Mean: " + getGeometricMean());
		System.out.println("Variance: " + getVariance());
		System.out.print("Max: ");
		getMax();
		System.out.println("------------------------");
	}

	/*
	 * This method computes the Mean
	 */
	private double getMean() {
		if (data.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int value : data) {
			sum += value;
		}
		return (double) sum / data.length;
	}

	/*
	 * This method computes the Geometric Mean = square root of all the products of
	 * each data
	 */
	private double getGeometricMean() {
		if (data.length == 0) {
			return 0;
		}
		double product = 1.0;
		for (int value : data) {
			product *= value;
		}
		return Math.pow(product, 1.0 / data.length);
	}

	/*
	 * This method computes the Variance
	 */
	private double getVariance() {
		if (data.length == 0) {
			return 0;
		}
		double mean = getMean();
		double sumOfSquares = 0.0;
		for (int value : data) {
			double difference = value - mean;
			sumOfSquares += difference * difference;
		}
		return sumOfSquares / data.length;
	}

	/*
	 * This method identifies the largest number
	 */
	private void getMax() {
		if (data.length == 0) {
			System.out.println("No data available.");
			return;
		}
		int max = data[0];
		for (int value : data) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println(max);
	}
}
