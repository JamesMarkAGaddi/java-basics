package org.acumen.training.codes;

public class BadNews {
	public static int maxOdd = 21;

	public static void writeOdds() {
		for (int count = 1; count <= maxOdd;) { // print each odd number
			System.out.print(count + " ");
			count = count + 2;
		}
		System.out.println();
	}

	public void run() {
		writeOdds();  // write all odds up to 21
		maxOdd = 11; // now, write all odds up to 11
		writeOdds();
	}
}