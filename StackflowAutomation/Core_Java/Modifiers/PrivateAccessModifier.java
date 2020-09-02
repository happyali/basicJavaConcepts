package Modifiers;
//The private access modifier is accessible only within class.

// Uncomment this if you want to see the issue with Private Access Modifier
/* 
class A{  
	private int data=40;  
	private void msg(){System.out.println("Hello java");}  
	}  
	  
	  public class PrivateAccessModifier{  
	  public static void main(String args[]){  
	  A obj=new A();  
	  System.out.println(obj.data);			//Compile Time Error  
	  obj.msg();							//Compile Time Error  
	  }  
	}
*/
	
	
// Uncomment this if you want to see Working Class after removing the Private Modifier
  
	class Bb{	 
	int data=40;  
	void msg(){System.out.println("Hello java");}  
	}  
	  
		public class PrivateAccessModifier{  
	 	public static void main(String args[]){  
	 	Bb obj=new Bb();  
	  	System.out.println(obj.data);	//Compile Time Error  
	   	obj.msg();						//Compile Time Error  
	   }  
	}
	
