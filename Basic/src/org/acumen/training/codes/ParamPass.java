package org.acumen.training.codes;

public class ParamPass {
	
	// memory address primitive type - diretsong memory address and varibles
	// java has no pointers
	public void passPrimitive(double grade) {
		System.out.println(grade);
		grade += 10;
		System.out.println(grade);
	}

	// may isa kang variable na nakaref ka sa isang object
	// address muna dadaanan before yung value
	public void passReference(StringBuilder sbLocal) {
		System.out.println(sbLocal);
		sbLocal.append("The cuz of stringbuilder");
		System.out.println(sbLocal);
		sbLocal = new StringBuilder();
	}

	public void passReferenceString(String strLocal) {
		System.out.println(strLocal);
		System.out.println(strLocal.hashCode());
		strLocal += "This is a string";
		System.out.println(strLocal);
		System.out.println(strLocal.hashCode());
	}
	
}
