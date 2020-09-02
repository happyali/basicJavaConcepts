package Constructor;

class ConstructorParameterized {

    int id;  
    String name;  
      
    ConstructorParameterized(int i,String n){  
    id = i;  
    name = n;  
	System.out.println("I am in Constructor with " + id + " " + name);
    }  
    
    void display(){
		System.out.println("I am in display method with " + id + " " + name);
    	}  
   
    public static void main(String args[]){  
    ConstructorParameterized s1 = new ConstructorParameterized(111,"Automation");  
    ConstructorParameterized s2 = new ConstructorParameterized(222,"Functional");  
    s1.display();  
    s2.display();  
   }  
} 
