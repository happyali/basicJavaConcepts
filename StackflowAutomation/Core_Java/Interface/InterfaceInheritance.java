package Interface;

interface PrintFace{  
void print();  
}  
interface ShowFace extends PrintFace {  
void show();  
}  
  
class InterfaceInheritance implements ShowFace{  
	public void print(){System.out.println("Printing Hello");}  
	public void show(){System.out.println("Showing Welcome");}  
	
public static void main(String args[]){  
	InterfaceInheritance obj = new InterfaceInheritance();  
obj.print();  
 }  
}  

