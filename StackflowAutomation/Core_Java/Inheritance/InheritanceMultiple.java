package Inheritance;

class C {

	void msg() {
		System.out.println("Hello");
	}
}

class AnotherClass {
	void msg() {
		System.out.println("Welcome");
	}
}

class InheritanceMultiple extends C {//,AnotherClass {			//suppose if it were  

	public static void main(String args[]) {
		InheritanceMultiple obj = new InheritanceMultiple();
		obj.msg();								// Now which msg() method would be invoked?
	}
}

/*
 * To reduce the complexity and simplify the language, multiple inheritance is
 * not supported in java.
 * 
 * Consider a scenario where A, B and C are three classes. The C class inherits
 * A and B classes. If A and B classes have same method and you call it from
 * child class object, there will be ambiguity to call method of A or B class.
 * 
 * Since compile time errors are better than runtime errors, java renders
 * compile time error if you inherit 2 classes. So whether you have same method
 * or different, there will be compile time error now.
 */