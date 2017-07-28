
/**********
 *
 * C_javaBasicVariableStringObject.java
 * 
 *********/


package a_BasicEexample;

/**********
 * 
 * string
 * 
 * String object variable: string is a sequence of character. 
 * 
 **********/

public class C_javaBasicVariableStringObject {

	/**********
	 * 
	 * attributes / variable declaration -  
	 * escaped characters
	 * 
	 **********/
	
	//constant
	private static final char b = '\b'; //backSpace
	private static final char ff = '\f'; //formFeed
	private static final char lf = '\n'; //lineFeed
	private static final char cr = '\r'; //carriageReturn
	private static final char ht = '\t';  //horizontalTab
	private static final char dq = '\"'; //doubleQuote
	private static final char sq = '\''; //singleQuote
	private static final char bs = '\\'; //backSlash

	
	
	/**********
	 * 
	 * String Concatenation - 
	 * 
	 * adding 2 string variable to create a new string variable using the + (plus operator)
	 *  
	 */
	public void StringConcatenation() {
		
		//Declare String variable and assign then a string value
		String stFullName ="", stFirstName = "yaki", stLastName="yak";
		
		//String Concatenation - adding 2 string variable to create a new string variable using the + (plus operator)  
	    stFullName = stLastName + ", " + stFirstName;
	    
	    //the new string
	    System.out.println("My Name is: " + stFullName);		
	}
	
	
	/**********
	 * 
	 * Primitive Variable To String
	 *  
	 **********/
	public void PrimitiveVariableToString() {
		
		int intNumber = 123;
		String StringVal;
		
		StringVal = Integer.toString(intNumber); //Integer to String
		System.out.println("primitiveVariableToString >>> Integer to String >>> " + StringVal);
		
		/****
		 * StringVal = Byte.toString(byte);
		 * StringVal = Short.toString(short);
		 * StringVal = Integer.toString(Integer);
		 * StringVal = Long.toString(long);
		 * StringVal = Float.toString(float);
		 * StringVal = Double.toString(double);
		 * StringVal = Boolean.toString(boolean);
		 */

	}

	
	
	/**********
	 * 
	 * String To Primitive Variable
	 *  
	 **********/
	public void StringToPrimitiveVariable() {
		
		String StringVal = "321";
		int intNumber = 0;

		intNumber = Integer.parseInt(StringVal); //String to integer
		System.out.println("StringToPrimitiveVariable >>> String to Integer >>> " + intNumber);
				
		/****
		 * short shortNumber = Short.parseShort(StringVal);
		 * byte byteNumber = Byte.parseByte(StringVal);
		 * int intNumber = Integer.parseInt(StringVal);
		 * long LongNumber = Long.parseLong(StringVal); 
		 * float FloatNumber = Float.parseFloat(StringVal);
		 * double DoubleNumber = Double.parseDouble(StringVal);
		 * boolean booleanNumber = Boolean.parseBoolean(StringVal); 
		 */
		
	}

	
	/**********
	 * 
	 * Casting - cast one primitive type variable to another primitive type variable.
	 * (int)  (byte)  (short)  (long)  (double)
	 * 
	 **********/	
	public void CastingNumbers() {
			
		byte byteNumber = 10;
		short shortNumber = 20;
		int intNumner = 30;
		long longNumber = 33l;
		float floatNumber = 12.32F;
		double doubleNumber = 1234.432;
		
		
		/**********
		 * 
		 * Casting type:
		 * (int)  (byte)  (short)  (long)  (double)
		 * 
		 ***********/
		
		byte float2byte = (byte) floatNumber;
	    int float2int = (int) floatNumber;
	    short float2short = (short) floatNumber;
	    long double2long = (long) doubleNumber;
	    
	    
	    System.out.println(floatNumber + " (casting float to integer) === " + float2int);
	
	}
	
	/****
	 * 
	 * Generate Random Number
	 * @param intMaxNumber - max number to generate a random number
	 * 
	 */
	public void GenerateRandomNumber(int intMaxNumber)
	{
		int intRandomNumber= 0;
		intMaxNumber ++;
		
		intRandomNumber = (int) (Math.random()* intMaxNumber);
		
		System.out.println("\nRandom number is (0-" + intMaxNumber + " == " + intRandomNumber);
	}
				
				
	
	public void TextFormatingPrintF() 
	{
		byte byteNumber = -1;
		short shortNumber = 21;
		int intNumner = 321;
		long longNumber = 54321;
		float floatNumber = 12.32F;
		double doubleNumber = 1234.432;
		char ch = 'A';
		String welcome = "good morning";
		
		String [] stText = {"this", "is", "some", "text"};
		int [] number = {62,73,81,64,55,43,92,54,63,74};
				

		
		/****
		 * 
		 *	printf()
		 *
		 *  printf(" % [flags] [width] [.precision] conversion-character
		 * 
		 * 
		 * [flag]
		 *  -  : left alignment (default alignment)
		 *  +  : output a plus ( + ) or minus ( - ) sign for a numerical value
		 *  0  : forces numerical values to be zero-padded ( default is blank padding ) 
		 *  ,  : comma grouping separator (for numbers > 1000)
		 *  ' '  : space will display a minus sign if the number is negative or a space if it is positive
		 *   
		 *   
		 *   [width]
		 *   Specifies the field width for outputting the argument.
		 *   
		 *   
		 *   [.precision]
		 *   Specifies the floating-point values or the length
		 *   
		 *   
		 *   conversion-character
		 *   d : decimal integer [byte, short, int, long] 
		 *   f : floating-point number [float, double] 
		 *   c : character Capital C will uppercase the letter 
		 *   s : String Capital S will uppercase all the letters in the string 
		 *   h : hashcode A hashcode is like an address. This is useful for printing a reference 
		 *   n : newline Platform specific newline character- use %n instead of \n for greater compatibility
		 *   
		 */
		
		System.out.println("\nprintf(\"byte  =  %-,5d \\n\" ,byteNumber);");
		System.out.println("% [flags] [width] [.precision] conversion-character");
		
		// bytes/ short/ int/ long/ === %d 
		System.out.printf("byte  =  %10d \n" ,byteNumber);
		System.out.printf("short =  %10d \n" ,shortNumber);
		System.out.printf("int   =  %10d \n" ,intNumner);
		System.out.printf("long  =  %10d \n" ,longNumber);
		System.out.printf("long  =  %,10d \n" ,longNumber);

		
		// bytes/ short/ int/ long/ === %d
		System.out.printf("byte  =  %,-10d \n" ,byteNumber);
		System.out.printf("short =  %,-10d \n" ,shortNumber);
		System.out.printf("int   =  %,-10d \n" ,intNumner);
		System.out.printf("long  =  %,-10d \n" ,longNumber);
		

		// bytes/ short/ int/ long/ === %d
		System.out.printf("byte  =  %,010d \n" ,byteNumber);
		System.out.printf("short =  %,010d \n" ,shortNumber);
		System.out.printf("int   =  %,010d \n" ,intNumner);
		System.out.printf("long  =  %,010d \n" ,longNumber);

		
		// char === %c
		System.out.printf("char  =  %-10c \n" ,ch);
		
		
		// float / float ===  %f
		System.out.printf("float  =  %-,10.5f \n" ,floatNumber);
		System.out.printf("double =  %-,10.5f \n" ,doubleNumber);
		
		
		System.out.printf("String = %s %n         to you", welcome);
		
		System.out.printf("%n");
		for (String  StringOutput: stText) {
			System.out.printf("%10s", StringOutput);
		}
		
		
		//int [] number = {62,73,81,64,55,43,92,54,63,74};
		String StFormat = "";
		//formating
		for (int i=0; i < number.length; i++) {
			StFormat = StFormat.format("%nid: %-3d  ,value: %-5d ", i ,number[i]);
			System.out.printf("%s" ,StFormat);
		}

		
	}
	
	
	public static void main(String[] args) {
		
		C_javaBasicVariableStringObject c = new C_javaBasicVariableStringObject();
		
		//String Concatenation
		c.StringConcatenation();
		
		//Primitive Variable To String
		c.PrimitiveVariableToString(); 
		
		//String To Primitive Variable
		c.StringToPrimitiveVariable();
		
		//Casting Numbers
		c.CastingNumbers();
		
		c.TextFormatingPrintF();
	}

}
