package org.acumen.training.codes.greeting;

public class Shape {
	//collision problems
	
	
	// there are 6 classifications of variables based on scoping
	//Global scope - instance variables
	public int size;
	//GLobal scope - class variables
	public static double area;
	public static final char MALE= 'm'; //final makes the value unchangeable
	public static final char FEMALE= 'f';
	public static final char ANY= 'o';

	public void referenceLocal (int localId, String localName) { //method signature
		int counter=0;
		double amount=0.0;
		char isLetter = '\0';
		
		
		
	}
	
	public void accessLocal() {
		float size=100.0F; // same name sa global, ito ang matatawag kasi sya pinakamlaapit
		System.out.println(size);
	}
}
