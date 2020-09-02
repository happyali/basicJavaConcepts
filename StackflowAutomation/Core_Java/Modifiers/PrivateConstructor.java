package Modifiers;

//If you make any class constructor private, you cannot create the instance of that class from outside the class.
//If you don't use any modifier, it is treated as default by default. The default modifier is accessible only within package.

//Uncomment this if you want to see the issue with Private Access Modifier
/*
class A {
	private A() {}						// private constructor
	void msg() {
		System.out.println("Hello java");
	}
}

public class PrivateConstructor {
	public static void main(String args[]) {
		A obj = new A();// Compile Time Error
	}
}
*/

// Uncomment this if you want to see Working Class after removing the Private
// Modifier
 
import Basics.*;   						// This is to utilized external class from another package.
class Aa {
	Aa() {}								// private constructor
	void showmsg() {
		System.out.println("Hello java");
	}
}

public class PrivateConstructor {
	public static void main(String args[]) {
		Aa obj1 = new Aa();				// Compile Time Error
		obj1.showmsg();
		Bb obj2 = new Bb();
		ModifierExtn obj3 = new ModifierExtn();
		obj3.msg();
		System.out.println("Hello java2");
	}
}
