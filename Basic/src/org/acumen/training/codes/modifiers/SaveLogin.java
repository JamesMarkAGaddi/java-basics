package org.acumen.training.codes.modifiers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveLogin {

	public static void main(String[] args) {
		Login login = new Login();
		login.userName = "root";
		login.passWord = "admin2255";
		login.role = 0;
		try {
			FileOutputStream fos = new FileOutputStream("./src/backup/login.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(login);
			oos.flush();
			oos.close();
			System.out.println("SAVED LOGIN!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
