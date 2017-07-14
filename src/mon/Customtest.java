package mon;

import java.util.Scanner;

class Fundsexception extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Fundsexception() {
		super("insufffient amount");
	}
}

class Invalidamountexception extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Invalidamountexception() {
		super("enter valid amount");
	}
}

class Account {
	int cb;

	public void deposit(int amt) throws Invalidamountexception {
		if (amt >= 100) {
			cb = cb + amt;
		} else
			throw new Invalidamountexception();
	}

	public void withdraw(int amt) throws Fundsexception {
		if (cb - amt >= 100) {
			cb = cb - amt;
			System.out.println("your remaining balance is" + cb);
		} else {
			throw new Fundsexception();
		}
	}
}

class Customtest {
	public static void main(String[] args) {
		Account a = new Account();
		try {
			System.out.println("enter the deposit amount");
			Scanner sc = new Scanner(System.in);
			int amt = sc.nextInt();
			a.deposit(amt);
			System.out.println("enter the withdraw amount");
			amt = sc.nextInt();
			a.withdraw(amt);
		} catch (Fundsexception e) {
			System.out.println(e.getMessage());
		} catch (Invalidamountexception e) {
			System.out.println(e.getMessage());
		}
	}
}