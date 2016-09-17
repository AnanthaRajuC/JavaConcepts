/**
 * @author anantharaju
 * Switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement.
 */
package ssPackage;

public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		int number=20; 
		
		//Switch Statement
	    switch(number)
	    {  
	    	case 10: System.out.println("\n10");
	    	break;  
	    	
	    	case 20: System.out.println("\n20");
	    	break;  
	    	
	    	case 30: System.out.println("\n30");
	    	break;  
	    	
	    	default:System.out.println("\nNot in 10, 20 or 30");  
	    }  
	    
	    //Switch Statement is fall-through
	    //it executes all statements after first match if break statement is not used with switch cases
	    switch(number)
	    {  
	    	case 10: System.out.println("\n10");  
	    	
	    	case 20: System.out.println("\n20");
	    	
	    	case 30: System.out.println("\n30");  
	    	
	    	default:System.out.println("\nNot in 10, 20 or 30");  
	    }  
	}
}
