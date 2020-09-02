package Method;

//1) Example of Method Overloading by changing the no. of arguments
public class MethodOverloading_ChgArguments {

	 void sum(int a,int b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
	  
	  public static void main(String args[]){  
		  MethodOverloading_ChgArguments obj=new MethodOverloading_ChgArguments();  
	  obj.sum(10,10,10);  
	  obj.sum(20,20);  
	  
	  }  
	}  
