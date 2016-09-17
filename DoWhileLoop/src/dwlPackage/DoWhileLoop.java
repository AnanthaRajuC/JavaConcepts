/**
 * @author anantharaju
 * If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use while loop
 */
package dwlPackage;

public class DoWhileLoop 
{

	public static void main(String[] args) 
	{
		int i=1;  
		
	    do
	    {  
	        System.out.println(i);  
	        i++;  
	    }
	    while(i<=10);  
	    
	    //Infinitive do-while Loop
	    do
	    {  
	        System.out.println("infinitive do while loop");  
	    }
	    while(true);  
	}
}
