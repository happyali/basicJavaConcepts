package Super;

class Student {
	void message() {
		System.out.println("Student are welcome");
	}
}

class SuperInvokeParentMethod extends Student {
	void message() {
		System.out.println("welcome to java");
	}

	void display() {
		message();// will invoke current class message() method
		super.message();// will invoke parent class message() method
	}

	public static void main(String args[]) {
		SuperInvokeParentMethod s = new SuperInvokeParentMethod();
		s.display();
	}
}
