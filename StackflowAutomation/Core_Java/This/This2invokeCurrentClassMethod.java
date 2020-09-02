package This;

class This2invokeCurrentClassMethod {

	void m() {
		System.out.println("method m is invoked");
	}

	This2invokeCurrentClassMethod() {
		//this();								// it is used to invoked current class constructor.
		System.out.println("default constructor is invoked");
	}
	
	This2invokeCurrentClassMethod(int accountid, String accountname) {
		this();
	}
	
	void n() {
		System.out.println("I am in method n");
		this.m(); 		// no need because compiler does it for you.
		//this.p(); 		// no need because compiler does it for you.
	}

	void p() {
		System.out.println("I am in method p");
		n(); 			// complier will add this to invoke n() method as this.n()
	}

	public static void main(String args[]) {
		This2invokeCurrentClassMethod s1 = new This2invokeCurrentClassMethod(000, "abc");
		s1.p();
	}
}
