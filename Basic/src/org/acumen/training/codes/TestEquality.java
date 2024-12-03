package org.acumen.training.codes;

public class TestEquality {
	public static void main(String[] args) {
		double grade = 99.1;
		double standard = 80.00;		
		System.out.println(grade >= standard); // primitives uses values
		
		StringBuilder sb = new StringBuilder("Juan Luna");
		StringBuilder sb2 = new StringBuilder("Juan Luna");
		System.out.println(sb.toString().equals(sb2.toString())); //objects contains unique addresses so .equals
		//.toString to extract the String value
	}
}
