package Basics;

class FreshJuiceTest {

	   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	   FreshJuiceSize size;
	}

class SimpleClass {

		   public static void main(String args[]){
		      FreshJuiceTest juice = new FreshJuiceTest();
		      juice.size = FreshJuiceTest.FreshJuiceSize.MEDIUM ;
		      System.out.println("Size: " + juice.size);
		      System.out.print("Second instance ----- Size: " + juice.size);
		   }
		}

	
	/*Questions:
	 *Difference between println and print?
	 *Is static variable is Local or Instance?
	 *Difference between Static variable and Global Variable?
	 *Difference between class define as only "Class" and "Public Class"
	 *access Static variable 
	 *what if "this" is not the first statement in constructor to invoke it.
	 *what is Aggregation (Has-A) ?
	 *what is Inheritance(Is-A)?
	 *How to print a statement "Hello" before any Main Class steps?
	 *What is Method Overloading and can we overload Main method?
	 *What is Multiple and Hybrid Inheritance? give block diagram of it.
	 *What if a class is not declare as private or public?
	 *How to run MethodOverRide samples?
	 *What is upcasting and downcasting?
	 * 
	 */
	
	