
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
	private char b = '\b'; //backSpace
	private char ff = '\f'; //formFeed
	private char lf = '\n'; //lineFeed
	private char cr = '\r'; //carriageReturn
	private char ht = '\t';  //horizontalTab
	private char dq = '\"'; //doubleQuote
	private char sq = '\''; //singleQuote
	private char bs = '\\'; //backSlash

	
	
	/**********
	 * 
	 * String Concatenation - 
	 * 
	 * adding 2 string variable to create a new string variable using the + (plus operator)
	 *  
	 */
	public void StringConcatenation() {
		
		//Declare String Varibale and assing then a string value
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
		
	}

}
