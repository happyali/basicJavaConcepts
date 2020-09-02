package Polymorphism;

/*
 * Method is overridden not the datamembers, so runtime polymorphism can't be achieved by data members.
 */
class Car {

	 int speedlimit=90;  
	}  
	class PolyDataMember extends Car{  
	 int speedlimit=150;  
	  
	 public static void main(String args[]){  
		 Car obj=new PolyDataMember();  
	  System.out.println(obj.speedlimit);//90  
	} 
	}
