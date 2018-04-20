package MySpliteString;

import java.io.*;

public class MySplite {

	public static void main(String args[]) {
		String Str = new String("Добро пожаловать на ProgLang.su");

		System.out.println("Возвращаемое значение: ");
		for (String retval : Str.split(" ")) {
			System.out.println(retval);
		}
	}
}
