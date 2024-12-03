package org.acumen.training.codes;

import javax.swing.JOptionPane;

public class TestDatabase {
	public static void main(String[] args) {
		Database db = new Database();
		db.printDetails(1, "Juan", "Luna");

		JOptionPane.showMessageDialog(null, "james", "mark", 0);
	}
}
