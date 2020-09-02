package Polymorphism;

/*
 * Polymorphism in java is a concept by which we can perform a single action by different ways.
 * There are two types of polymorphism in java: compile time polymorphism and runtime polymorphism. 
 * We can perform polymorphism in java by method overloading and method overriding.
 * If you overload static method in java, it is the example of compile time polymorphism
 * 
 * 
 * Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is 
 * resolved at runtime rather than compile-time.
 * Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.
 * 
 * In this process, an overridden method is called through the reference variable of a superclass. 
 * The determination of the method to be called is based on the object being referred to by the reference variable. 
 */
class Splender {

	void run() {
		System.out.println("running");
	}
}

class PolyBasic extends Splender {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Splender b = new PolyBasic();			
		// upcasting: When reference variable of Parent class refers to the object of Child class, it is known as upcasting.
		b.run();
	}
}