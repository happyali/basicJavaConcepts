package Modifiers;
import Basics.*;   // This will help to import the protected ProtectedModifierExtn Class for method msg().

//The protected access modifier is accessible within package and outside the package but through inheritance only.
//The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.

public class ProtectedAccessModifier extends ProtectedModifierExtn{

	  public static void main(String args[]){  
		  ProtectedAccessModifier obj = new ProtectedAccessModifier();  
	   obj.msg();  
	  }  
	}

