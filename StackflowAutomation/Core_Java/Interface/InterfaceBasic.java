package Interface;

interface printable {
	void print();
	void print(int a);
	//void draw();    // Uncomment this and try to learn the main difference between Abstarct and Interface.
}

class InterfaceBasic implements printable {

	public static void main(String args[]) {
		InterfaceBasic obj = new InterfaceBasic();
		obj.print();
	}

	public void print() {
		System.out.println("Hello");
	}

	@Override
	public void print(int a) {
		// TODO Auto-generated method stub
		
	}

}
