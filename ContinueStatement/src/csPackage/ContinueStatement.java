/**
 * @author anantharaju
 * It continues the current flow of the program and skips the remaining code at specified condition.
 */
package csPackage;

public class ContinueStatement 
{

	public static void main(String[] args) 
	{
		 for(int i=1;i<=10;i++)
		 {  
		        if(i==5)
		        {  
		        	i=9;
		        	System.out.println("\n");
		            continue;  
		        }  
		        System.out.println(i);  
		 }  
	}
}
