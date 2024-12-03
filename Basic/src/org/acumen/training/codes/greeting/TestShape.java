package org.acumen.training.codes.greeting;

public class TestShape {
	
	
	
	
	//String[] args is called command-line parameters
	
	public static void main(String[] args) { //not a method thread instead
		//instance means object or snapshot of a class
		Shape s =  new Shape();
		s.size = 10;
		System.out.println(s.hashCode());

		Shape s2 =  new Shape();
		s2.size = 20;
		System.out.println(s2.hashCode());
		 System.out.println(s.size +"\n"+ s2.size);
		 
		 s.area = 125.5;
		 s2.area = 3000.5;
		 System.out.println(s.area +"\n"+ s2.area); // bawal pag class mag-aagawan sila ng value
		 
		 Shape.area = 90; //1 copy onleh
		 System.out.println(Shape.area);
		 
		 for(String param: args) {// block variables
			 System.out.println(param);
		 }
		 
		 for(int counter = 0; counter<=5; counter++) {
			 
		 }
		 
		 int counter2 = 0;
		 if(counter2 == 5) {
			 boolean isOn = false;
		 }
	}
}
