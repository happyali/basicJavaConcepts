package Method;

//Example of Method Overloading by changing data type of argument
public class MethodOverLoad_ChgDataTypArg {

	  void sum(int a,int b){
		  System.out.println(a+b);
		  }  
	  void sum(double a,double b){
		  System.out.println(a+b);
		  }  
	  
	  public static void main(String args[]){  
		  MethodOverLoad_ChgDataTypArg obj=new MethodOverLoad_ChgDataTypArg();  
	  obj.sum(10.5,10.5);  
	  obj.sum(20,20);  
	  
	  }  
	} 