package org.acumen.training.codes.test;

import org.acumen.training.codes.Overflow;

public class TestOverflow {
	public static void main(String[] args) {
		byte a = 120, b = 10;
		byte c = 50, d = 30;
		byte e = 127, f = 1;
		byte g = -128, h = -1;
		byte i = 127, j = 0;

		System.out.println("Overflow test 1: " + Overflow.sumOverflow(a, b));
		System.out.println("Overflow test 2: " + Overflow.sumOverflow(c, d));
		System.out.println("Overflow test 3: " + Overflow.sumOverflow(e, f));
		System.out.println("Overflow test 4: " + Overflow.sumOverflow(g, h));
		System.out.println("Overflow test 5: " + Overflow.sumOverflow(i, j));
	}
}
