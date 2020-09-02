package Interface;


interface PrintTask{  
void print();  
}  
interface Showable{  
void show();  
}
  
  
class InterfaceMultipleInheritance implements PrintTask,Showable{  
  
public void print(){System.out.println("Printing Hello");}  
public void show(){System.out.println("Showing Welcome");}  
  
public static void main(String args[]){  
	InterfaceMultipleInheritance obj = new InterfaceMultipleInheritance();  
obj.print();  
obj.show();  
 }  
}

