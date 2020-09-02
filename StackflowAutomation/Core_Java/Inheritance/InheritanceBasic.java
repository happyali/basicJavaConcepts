package Inheritance;

/*As displayed in the above figure, Programmer is the subclass and Employee is the superclass. 
 * Relationship between two classes is Programmer IS-A Employee.It means that Programmer is a type of Employee. 
 * 
 * In java programming, multiple and hybrid inheritance is supported through interface only.
 */

class Programmer {
	float salary = 40000;
}

class InheritanceBasic extends Programmer {
	int bonus = 10000;

	public static void main(String args[]) {
		InheritanceBasic p = new InheritanceBasic();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}
