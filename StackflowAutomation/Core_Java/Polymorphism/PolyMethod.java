package Polymorphism;

class Bank {

	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

class PolyMethod {
	public static void main(String args[]) {
		Bank sbi = new SBI();
		Bank icici = new ICICI();
		Bank axis = new AXIS();
		System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
	}
}
