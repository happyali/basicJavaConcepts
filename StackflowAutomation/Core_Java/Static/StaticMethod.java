package Static;

//Program of changing the common property of all objects(static field). 
class StaticMethod {

	int accountno;
	String accountname;
	static String accountype = "Corporate"; 		// Static variable

	static void change() { 							// Static Method
		accountype = "Business";
		System.out.println("I am in Static change method for AccountType = "+accountype);
	//	accountno = accountno+1;					// Cant access non - static
	}

	StaticMethod(int r, String n) { 				// normal Constructor
		accountno = r;
		accountname = n;
		System.out.println("I am in Constructor "+accountno + " " + accountname + " " + accountype);
	}

	void display() {								// normal Method
		System.out.println("I am in display method "+accountno + " " + accountname + " " + accountype);
	}

	public static void main(String args[]) {
		//StaticMethod.change();
		//accountype = "Hindi";
		//accountno = accountno+1;						// Cant access non - static
		StaticMethod s1 = new StaticMethod(111, "Mir     ");
		StaticMethod s2 = new StaticMethod(222, "Humaid  ");
		StaticMethod s3 = new StaticMethod(333, "Ali     ");
		StaticMethod.change();
		s1.display();
		s2.display();
		s3.display();
	}
}
