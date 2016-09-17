/**
 * @author anantharaju
 * The Java if statement is used to test the condition
 */
package ifsPackage;

public class IfStatements 
{
	public static void main(String[] args) 
	{
		int age=20;  
		
		//IF Statement
	    if(age>18)	//It executes the if statement if condition is true
	    {  
	        System.out.print("Age is greater than 18");  
	    }  
	    
	    int number=13; 
	    
	    //IF-else Statement
	    if(number%2==0)	//It executes the if block if condition is true otherwise else block
	    {  
	        System.out.println("even number");  
	    }
	    else
	    {  
	        System.out.println("\nodd number");  
	    }  
		
	    int marks=65;  
	    
	    //IF-else-if ladder Statement
	    if(marks<50)
	    {  
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60)
	    {  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70)
	    {  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80)
	    {  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90)
	    {  
	        System.out.println("A grade");  
	    }
	    else if(marks>=90 && marks<100)
	    {  
	        System.out.println("A+ grade");  
	    }
	    else
	    {  
	        System.out.println("Invalid!");  
	    }  
	}
}
