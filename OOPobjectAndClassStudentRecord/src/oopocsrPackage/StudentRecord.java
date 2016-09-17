/**
 * @author anantharaju
 */
package oopocsrPackage;

public class StudentRecord 
{
	int rollNo;
	String name;
	
	public static void main(String[] args) 
	{
		StudentRecord sr1 = new StudentRecord();
		StudentRecord sr2 = new StudentRecord();
		
		sr1.insertRecord(101, "Lars Ulrich");
		sr2.insertRecord(202, "Cliff Burton"); 
		
		sr1.displayRecord();
		sr2.displayRecord();
	}
	
	void insertRecord(int rn, String n)
	{
		rollNo=rn;  
		name  =n;  
	}
	
	void displayRecord()
	{
		System.out.println("rollNo: "+ rollNo);
		System.out.println("name: "+ name);
		System.out.println("\n");
	}
}
