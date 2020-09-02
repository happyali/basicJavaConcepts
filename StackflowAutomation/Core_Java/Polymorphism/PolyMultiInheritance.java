package Polymorphism;

class Dog {

	void eat() {
		System.out.println("eating  bones");
	}
}

class BabyDog extends Dog {
	void eat() {
		System.out.println("drinking milk");
	}
}

class PolyMultiInheritance extends BabyDog {
	void eat() {
		System.out.println("eating everything");
	}

	public static void main(String args[]){  
	Dog a1,a2,a3;  
	a1=new PolyMultiInheritance();  
	a2=new Dog();  
	a3=new BabyDog();  
	  
	a1.eat();  
	a2.eat();  
	a3.eat();  
	}
}