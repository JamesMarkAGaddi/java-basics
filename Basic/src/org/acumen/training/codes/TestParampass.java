package org.acumen.training.codes;

import org.acumen.training.codes.modifiers.Accounts;

public class TestParampass extends Accounts {
	public static void main(String[] args) {
		ParamPass pP = new ParamPass();
		double grade = 99.5;
		pP.passPrimitive(grade);
		pP.passPrimitive(grade);
		System.out.println(grade);

		StringBuilder sb = new StringBuilder("This is a character sequence");// character-based like stirng API
		// it doesn't not carry any value
		// sb points to an objetc created by the instructor
		// ref
		System.out.println(sb);
		System.out.println(sb.hashCode());

		pP.passReference(sb);
		System.out.println(sb);

		String str = new String("This is a character sequence");
		pP.passReferenceString(str);
		System.out.println(str);
		System.out.println(str.hashCode());
	
	}
	
	public void accessResources() {
		amount = 789.09;
		depositAmount();
	}
}
