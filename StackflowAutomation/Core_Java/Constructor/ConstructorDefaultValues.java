package Constructor;

//Example of default constructor that displays the default values
class ConstructorDefaultValues {

	int id;
	String name;

	//void display() {
	ConstructorDefaultValues(){
		System.out.println("I am in Constructor with " + id + " " + name);
	}

	public static void main(String args[]) {
		System.out.println("I am at step 1");
		ConstructorDefaultValues s1 = new ConstructorDefaultValues();
		System.out.println("I am at step 2");
		ConstructorDefaultValues s2 = new ConstructorDefaultValues();
		System.out.println("I am at step 3");
		//s1.display();
		//s2.display();
		System.out.println("I am at step 4");

	}
}












/* Question
 What will be the output?
 What changes are required to get output as:
 	I am at step 1
	I am at step 2
	I am at step 3
 */
