package This;

class ThisIdentifyLocalnInstanceVariable {
	int accountid;
	String accountname;

	ThisIdentifyLocalnInstanceVariable(int i, String n) {
		accountid= i;
		accountname = n;
	}

	void display() {
		System.out.println(accountid+ " " + accountname);
	}

	public static void main(String args[]) {
		ThisIdentifyLocalnInstanceVariable e1 = new ThisIdentifyLocalnInstanceVariable(111, "karan");
		ThisIdentifyLocalnInstanceVariable e2 = new ThisIdentifyLocalnInstanceVariable(222, "Aryan");
		e1.display();
		e2.display();
	}
}
