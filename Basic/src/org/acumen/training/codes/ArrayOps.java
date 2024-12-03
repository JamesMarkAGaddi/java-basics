package org.acumen.training.codes;

import java.util.Arrays;

public class ArrayOps {

	public void arrayConvert() {

		char[] letters = { 's', 'e', 'c', 'u', 'r', 'i', 't', 'y' };
		String word = new String(letters);
		System.out.println(word);
		System.out.println();

		byte[] ascii = { 97, 90, 50, 60, 78, 67 };
		String anotherWord = new String(ascii);
		System.out.println(anotherWord);
		System.out.println();

		String[][] names = { { "James", "Mark", "Alfaro", "Gaddi" }, { "Nacut", "lang", "kasi", "mahaba" },
				{ "okay", "lang", "naman", "yon" } };

		for (String[] l : names) {
			for (String w : l) {
				System.out.print(w + " ");
			}
		}
	}

	public void arrayTransfer() {
		int[] arrData = { 1, 2, 3, 10, 11, 15 };
		int[] temp = new int[10];

		System.arraycopy(arrData, 0, temp, 0, arrData.length);
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(arrData));
	}
}
