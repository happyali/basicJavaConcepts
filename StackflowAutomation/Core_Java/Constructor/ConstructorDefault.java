package Constructor;

 class ConstructorDefault {

	ConstructorDefault(){
		System.out.println("I am in Constructor");
		} 
	
	public static void main(String args[]){ 
		System.out.println("I am at step 1");
		ConstructorDefault b=new ConstructorDefault();
		System.out.println("I am at step 2");
	}  
	} 
