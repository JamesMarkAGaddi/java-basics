/*
	Description: This program swaps the value of two 2 integers
	Author: James Mark A. Gaddi
	Date: September 20, 2024
*/
package org.acumen.training.codes.itemf;

public class AssignMe {

	public static void main(String[] args) {
		int x = 3;
		int y = x * 2;

		int temp = x;
		x = y;
		y = temp;

		System.out.println("x = " + x + "\ny = " + y);
	}
}
