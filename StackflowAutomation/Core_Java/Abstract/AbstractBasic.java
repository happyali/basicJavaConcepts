package Abstract;

/*
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * Another way, it shows only important things to the user and hides the internal details
 * 
 * Abstraction lets you focus on what the object does instead of how it does it.
 * 
 * Abstract class needs to be extended and its method implemented. It cannot be instantiated.
 * 
 * Abstract Method: A method that is declared as abstract and does not have implementation is known as abstract method.

 */
abstract class Baseclass{
	abstract void run();
	void walk() {
	}
}

class AbstractBasic  extends Baseclass {
	void run() {
		System.out.println("running safely..");
	}

	public static void main(String args[]) {
		Baseclass obj = new AbstractBasic ();
		obj.run();
	}

}