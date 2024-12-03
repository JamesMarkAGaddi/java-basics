package org.acumen.training.codes;

public class ObjectComparison {
	public static void main(String[] args) {
		Profile p = new Profile();
		p.id = 101;
		p.firstName = "James";
		p.lastName = "Mark";
		p.age = 60;
		p.salary = 987890.33;

		Employee emp = new Employee(101, "maria", "Clara", (byte)55, 98732.123);
		System.out.println(emp);
		System.out.println(emp.firstName());		
		System.out.println(p);
		
		System.out.println(p instanceof Profile); // to check what type of objetc it refers
		System.out.println(emp instanceof Object);
		
	}
}
