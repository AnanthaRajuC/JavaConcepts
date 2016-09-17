/**
 * @author anantharaju
 */
package dtPackage;

public class DataType 
{
	public static void main(String[] args) 
	{
		// Literals
		boolean result = true;
		char capitalC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000;
		
		System.out.println(result);
		System.out.println(capitalC);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		
		//Integer Literals
		int decVal = 26;	    // The number 26, in decimal
		int hexVal = 0x1a;	    // The number 26, in hexadecimal
		int binVal = 0b11010;	// The number 26, in binary
		
		System.out.println("\n");
		System.out.println(decVal);
		System.out.println(hexVal);
		System.out.println(binVal);
		
		//Floating-Point Literals
		double d1 = 123.4;
		double d2 = 1.234e2;	// same value as d1, but in scientific notation
		float f1  = 123.4f;
		
		System.out.println("\n");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(f1);
		
		//Using Underscore Characters in Numeric Literals -improves the readability of code
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println("\n");
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
		System.out.println(hexBytes);
		System.out.println(hexWords);
		System.out.println(maxLong);
		System.out.println(nybbles);
		System.out.println(bytes);
	}
}
