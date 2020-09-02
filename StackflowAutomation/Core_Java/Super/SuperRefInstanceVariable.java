package Super;

/*The super keyword in java is a reference variable that is used to refer immediate parent class object.
 * Whenever you create the instance of subclass, an instance of parent class is created implicitly 
 * i.e. referred by super reference variable.
 * 
 * Usage of java super Keyword
    1.	super is used to refer immediate parent class instance variable.
    2.	super() is used to invoke immediate parent class constructor.
    3.	super is used to invoke immediate parent class method.
*/

class Bike4 {

	int speed=50;  
	//void display(){  
		Bike4() {
		 System.out.println("I am in Parent Class " +speed);//will print speed of Vehicle now  
		}
	}  

	class SuperRefInstanceVariable extends Bike4{  
	int speed=100;  
	SuperRefInstanceVariable(){  
		   super();								//will invoke parent class constructor  
		   System.out.println("Bike is created");  
		  }
	    
	void display(){  
		 System.out.println("I am in Child Class "+super.speed);//will print speed of Vehicle now from Parent Class 
	}  
	public static void main(String args[]){  
		SuperRefInstanceVariable b=new SuperRefInstanceVariable();  
	 b.display(); 	   
	}  
	}


