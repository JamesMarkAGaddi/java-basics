package org.acumen.training.codes.modifiers;

public class TestModifiers {
	public static void main(String[] args) {
		Mathematics math = new Mathematics();
		//Accounts a = new Accounts();
		final Bank b = new Bank();
		System.out.println(b.computeInterest(2, 3, 4));
		//b = new Bank(); // cannot use b becuase nakafinal na sya kay bank()
		MyUtility.generateUtility(); // no need na mag instantiate kasi static na, like once mo lang gagamitin or di naman need maedit pa
	}
}
