package Basics;

class InstanceOf {

	static class InstanceOperator extends InstanceOf{ 
		
	 public static void main(String args[]){  
		 InstanceOf a=new InstanceOf();  
		 InstanceOf b =null;
		 InstanceOperator c=new InstanceOperator(); 
		 
		 
		 System.out.println(a instanceof InstanceOf);//true  
		 
		 //If we apply instanceof operator with a variable that have null value, it returns false
		 System.out.println(b instanceof InstanceOf);
		 
		 //An object of subclass type is also a type of parent class.
		 System.out.println(c instanceof InstanceOf);
		 }  
		} 
}