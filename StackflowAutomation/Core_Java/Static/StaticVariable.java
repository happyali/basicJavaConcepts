package Static;

class StaticVariable {

	int accountno;
	String accountname;
	static String accountype = "Corporate";

	StaticVariable(int r, String n) {
		accountno = r;
		accountname = n;
		System.out.println("I am in Constructor "+accountno + " " + accountname + " " + accountype);
	}

	void display() {
		System.out.println("I am in display method "+accountno + " " + accountname + " " + accountype);
	}

	public static void main(String args[]) {
		StaticVariable s1 = new StaticVariable(111, "Humaid");
		StaticVariable s2 = new StaticVariable(222, "Ali");

		s1.display();
		s2.display();
	}
}
