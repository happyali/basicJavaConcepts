package Basics;
import Modifiers.*;

/*class Bb{	 
	int data=40;  
	void msg(){System.out.println("Hello.. I am from another package (Basics) with default modifier");}  
}*/


public class ModifierExtn{	 
	int data=40;  
 public void msg(){System.out.println("Hello.. I am from another package (Basics) with public modifier");}  
 //Bb Obj = new Bb();  // Uncomment this line only to see the below clarification.
 // As Class Bb is having a default modifier, 
 // it cant be accessed from outside "Modifier" package.
}
