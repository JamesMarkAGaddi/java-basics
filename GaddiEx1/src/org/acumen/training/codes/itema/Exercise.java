package org.acumen.training.codes.itema;

public class Exercise {
	private int x = 101;

	private void f(int x) {
		x++;
		g();
	}

	private void g() {
		System.out.println(this.x); // Access instance variable x
	}

	public static void main(String[] args) {
		Exercise e = new Exercise();
		int x = 200;
		e.f(x);
	}
}
