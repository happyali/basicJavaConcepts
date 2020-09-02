package This;

class This4CurrentClassInstanceVariable {
    int accountid = 000;  
    String accountname ="First";  
      
    This4CurrentClassInstanceVariable(int id,String accountname){  
    this.accountid = id;  
    this.accountname = accountname;  
    } 
    
    void display(){
    	System.out.println("I am in display method "+ accountid+" "+accountname);
    	}  
  
    public static void main(String args[]){  
    This4CurrentClassInstanceVariable s1 = new This4CurrentClassInstanceVariable(111,"Humaid");  
    This4CurrentClassInstanceVariable s2 = new This4CurrentClassInstanceVariable(321,"Ali");  
    s1.display();  
    s2.display();  
    }  
}
/* 
 * Class instance variable will have preference over constructor variable if accountnames are same ?
 *
 * 
 * 
 * Add this to constructor variables
 * 
 * 
 * If local variables(formal arguments) and instance variables are different, there is no need to use this keyword
 */



