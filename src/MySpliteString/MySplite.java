package MySpliteString;

import java.io.*;

public class MySplite {

	public static void main(String args[]) {
		String Str = new String("����� ���������� �� ProgLang.su");

		System.out.println("������������ ��������: ");
		for (String retval : Str.split(" ")) {
			System.out.println(retval);
		}
	}
}
