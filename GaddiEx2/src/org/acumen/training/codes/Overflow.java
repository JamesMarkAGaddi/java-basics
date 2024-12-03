package org.acumen.training.codes;

public class Overflow {
	public static final byte BYTE_MIN = -128;
	public static final byte BYTE_MAX = 127;
	
	public static boolean sumOverflow(byte x, byte y) {
		int sum = x + y;
		if (sum < BYTE_MIN || sum > BYTE_MAX) {
			return true;
		}
		return false;
	}
}
