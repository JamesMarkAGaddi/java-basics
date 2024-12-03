package org.acumen.training.codes;

import java.util.Arrays;

public class MyArrays {

	public static void main(String[] args) {

		int[] arrData = new int[5];
		// single-dimensional array 1D array
		// contiguous
		// fixed length so dapat may laman ang second []
		// datatype[] pointer = new datatype[number of rows]
		// defaut contents ang laman when initialized

		System.out.println(Arrays.toString(arrData)); // util.Array to see lang laman ng array
		StringBuilder[] sb = new StringBuilder[10];
		System.out.println(Arrays.toString(sb));
		System.out.println();

		// we use index to populate your array
		int numItems = arrData.length;
		System.out.println(numItems);
		System.out.println();

		// array for primitive types
		arrData[0] = 2;
		arrData[1] = 12;
		arrData[2] = 22;
		arrData[3] = 32;
		arrData[4] = 42;

		// arrData[10] = 5; //will throw ArrayIndexOutOfBoundsExeption
		System.out.println(Arrays.toString(arrData));

		// array for reference types
		sb[0] = new StringBuilder("James");
		System.out.println(Arrays.toString(sb));

		// traversing through the array
		for (int lookup : arrData) {
			System.out.print(lookup + " ");
		}
		System.out.println();

		// mulit-deimnesional array 2d array
		double[][] matrix = new double[3][3];// [rows/hori][cols/vert]
		matrix[1][2] = 1000.50;

		// print 2d array
		for (double[] lookup : matrix) {
			System.out.println(Arrays.toString(lookup));
		}

		System.out.println();
		// print 2d array per item
		for (double[] lookup : matrix) { // per rows
			for (double item : lookup) { // item per row
				System.out.println(item + " ");
			}
		}
		System.out.println();

		// Jagged-arrays
		float[][] spatial = new float[3][]; // o default value unlike the first two
		// prone to NullPointerEception kasi nga walang laman yung per item so di
		// mapprint
		// new ispecify per row kaya isa-isa sila idedeclare
		spatial[0] = new float[2];
		spatial[1] = new float[5];
		spatial[2] = new float[4];
		// pwede na maglagy ng laman
		spatial[0][1] = 243213.2F;
		System.out.println(spatial[0][1]);
		// print 2d array
		for (float[] lookup : spatial) {
			System.out.println(Arrays.toString(lookup));
		}
		System.out.println();
	}
}
