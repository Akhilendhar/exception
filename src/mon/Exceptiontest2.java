package mon;

import java.util.Scanner;

class Usernameexception extends Exception {
	public Usernameexception() {
		super("enter valid username");
	}
}

class Passwordexception extends Exception {
	public Passwordexception() {
		super("enter the valid password");
	}

}

class test {
	public void username(String s) throws Usernameexception {
		if (s.equals("akhil")) {
			System.out.println("enter the password");
		} else
			throw new Usernameexception();

	}

	public void password(String st) throws Passwordexception {
		if (st.equals("akhil")) {
		} else
			throw new Passwordexception();
	}
}

class Exceptiontest2 {
	public static void main(String[] args) {

		test t = new test();
		try {
			System.out.println("enter the username");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			t.username(str);
			String pw = sc.next();
			t.password(pw);
			if (str.equals("akhil") && pw.equals("akhil"))
			System.out.println("you are login");

		} catch (Usernameexception e) {
			System.out.println(e.getMessage());
		} catch (Passwordexception e) {
			System.out.println(e.getMessage());
		}
	}

}