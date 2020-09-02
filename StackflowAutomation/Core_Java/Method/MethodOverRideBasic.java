package Method;

class Vehicle {

	void run() {
		System.out.println("Vehicle is running");
	}
}

class MethodOverRideBasic extends Vehicle {
	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String args[]){  
	MethodOverRideBasic obj = new MethodOverRideBasic();  
	Vehicle obj3 = new MethodOverRideBasic();
	obj.run();  
	obj3.run(); 
	}
}
