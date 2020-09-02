package Method;

class MethodMainOverload {

	  public static void main(int a){ 
		  System.out.println(a);  
		  }  
		    
		  public static void main(String args[]){  
			  int b=10;
		  System.out.println("main() method invoked");  
		  main(b);  
		  System.out.println("main() method is called for ="+b);
		  }  
		}
