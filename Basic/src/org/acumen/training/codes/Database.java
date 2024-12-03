package org.acumen.training.codes;

public class Database {

	// called spread operator // we cannot put more than one in var arg
	public void printDetails(int id, String... inputs) {
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i]);
		}

	}
}
