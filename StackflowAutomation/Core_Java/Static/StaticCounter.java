package Static;

class StaticCounter {

	static int count = 0;// will get memory when instance is created

	StaticCounter() {
		count++;
		System.out.println(count);
	}

	
	void display(int c) {
		System.out.println("I am in display method "+c);
	}
	
	public static void main(String args[]) {
		//count = count+1;
		StaticCounter c1 = new StaticCounter();
		StaticCounter c2 = new StaticCounter();
		StaticCounter c3 = new StaticCounter();
	}
	//static int count=0;//will get memory only once and retain its value
}
