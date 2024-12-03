package org.acumen.training.codes;

public class Isoceles {
	
	public boolean isIsoceles(final int x, final int y, final int z) {
		if ((x == y && x != z) || (x == z && x != y) || (y == z && x != y)) {
			return true;
		}
		return false;

	}
}
