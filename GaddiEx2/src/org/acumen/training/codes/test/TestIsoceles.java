package org.acumen.training.codes.test;

import org.acumen.training.codes.Isoceles;

public class TestIsoceles {
	
	public static void main(String[] args) {
		Isoceles iso = new Isoceles();
		System.out.println(iso.isIsoceles(5, 15, 85));
		System.out.println(iso.isIsoceles(32, 32, 85));
		System.out.println(iso.isIsoceles(5, 115, 115));
		System.out.println(iso.isIsoceles(43, 12, 12));
		System.out.println(iso.isIsoceles(835, 152, 825));
	}
}
