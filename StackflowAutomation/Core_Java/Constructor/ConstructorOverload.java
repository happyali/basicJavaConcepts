
class ConstructorOverload {

	int id;
	String name;
	int age;

	ConstructorOverload(int i, String n) {
		id = i;
		name = n;
		System.out.println("I am in Constructor 1 with " + id + " " + name);
	}

	ConstructorOverload(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
		System.out.println("I am in Constructor 2 with " + id + " " + name+ " "+age);
	}

	void display() {
		System.out.print("I am in display method with ");
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		ConstructorOverload s1 = new ConstructorOverload(111, "Karan");
		ConstructorOverload s2 = new ConstructorOverload(222, "Aryan", 25);
		ConstructorOverload s3 = new ConstructorOverload(333, "Aryan");
		s1.display();
		s2.display();
	}
}
