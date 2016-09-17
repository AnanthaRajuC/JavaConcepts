/**
 * @author anantharaju
 * Variable is name of reserved area allocated in memory
 */
package vtPackage;

public class VariableTypes 
{
	int data=50;	//Instance variable - A variable that is declared inside the class but outside the method
	
	static int m=100;	//Static variable - A variable that is declared as static is called static variable. It cannot be local.
	
	public static void main(String[] args) 
	{
		int n=90;	//Local variable - A variable that is declared inside the method
		
		System.out.println(m);
		System.out.println(n);
	}
}
