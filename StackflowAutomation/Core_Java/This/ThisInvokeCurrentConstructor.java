package This;

class ThisInvokeCurrentConstructor {

	int accountid = 0;
	String accountname = "abc";

	ThisInvokeCurrentConstructor() {
		System.out.println("default constructor is invoked");
	}

	ThisInvokeCurrentConstructor(int accountid, String accountname) {
		//this();								// it is used to invoked current class constructor.
		//this.accountid = accountid;
		//this.accountname = accountname;
		//this();								// what if "this" is not the first statement in constructor to invoke it.
		accountid = accountid;
		accountname = accountname;
	}

	void display() {
		System.out.println("I am in display method " +accountid + " " + accountname);
	}

	public static void main(String args[]) {
		ThisInvokeCurrentConstructor e1 = new ThisInvokeCurrentConstructor(111, "karan");
		ThisInvokeCurrentConstructor e2 = new ThisInvokeCurrentConstructor(222, "Aryan");
		e1.display();
		e2.display();
	}
}
