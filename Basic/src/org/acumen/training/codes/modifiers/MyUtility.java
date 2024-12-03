package org.acumen.training.codes.modifiers;

public class MyUtility {
	// kapag static pwede mo sila tawagin pero pag nonstatic hindi // gamit lang ang static kapag yung nilagyan mo is one copy lang or di transactional
	public String utilOfficer = null; 
	public static final String UTILITY1 = "LIVINGRoom";
	public static final String UTILITY2 = "DININGRoom";
	public static final String UTILITY3 = "BEDRoom";
	
	public static void generateUtility() {
		System.out.println("created facility object");
	}
	
	public void showOfficers() {
		int numHeads = 0 ;
	}

}
