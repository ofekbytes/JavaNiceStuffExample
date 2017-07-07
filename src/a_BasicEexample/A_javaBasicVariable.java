
/**********
 *
 * A_javaBasicVariable.java
 * 
 ***********/


/**********
 *
 * package 
 * 
 * A package is a "namespace" that organizes a set of related classes and interfaces. (like folder/directory to files)
 * 
 ***********/
package a_BasicEexample;


/**********
 * 
 * class
 * 
 * A "class" is the blueprint from which individual objects are created.
 * class: every line of code in java need to be inside a "Class".
 * 
 ***********/
public class A_javaBasicVariable {

	
/**********
 * 
 * attributes (global variable)
 * attributes / variable declaration 
 * (variable inside a class is an "attributes")
 *  
 * access Modifiers attributes: private/ public/ default/ protected
 * 
 * private: accessible only within the declared class itself.
 * public: accessible from any other class
 * default: no access control modifier available to any other class in the same package
 * protected: like "default" + "subclasses" can access protected variable/method of the superclass
 * 
 ***********/
	

/**********
 * 
 * variable type: byte, 
 * short, int, long, float, double, boolean
 * 
 ***********/
	
	/***
	 * static - 
	 * static variable/method belongs to the class, no need for "instance of the class". 
	 * create instance static.
	 */
	public static int intCount = 0;	
	
	private boolean flage = false; //boolean
	private int busCounter = 32321;	 //integer
	
	private char grade = 'A'; //char
	private char gardeNumber = 67; //char number
	private String Describe;	// String sequence of characters.
   
	private float CurrentAge = 3.2F; //
	private double PeopleCount = 332343234D;
	
	private static final double PI = 3.1415929; //final is a constant,(we cannot change the value) 
	

	
	
	/**********
	 * 	
	 * constructors - 
	 * 
	 * constructor - is special methods invoked when an object is created.
	 * constructor name must be same as its class name (with no "return" option)
	 * (Constructor is used to create a new Instance of the Class)
	 * 
	 ***********/
	public A_javaBasicVariable() {
		System.out.println("*~*~*~*~*~* am the first method to run, when creating a new instance of the class *~*~*~*~*~*~*\n");
	}





/********************
 *
 *  main Method/functions - first method that run inside a class.
 *  
 * 	public - anyone can access it
 * 	static - method that can run without creating an "instance of the class"
 * 	void - method do not return value (when done execute)
 * 	main - first method executed (need one in every java program)	
 *  String[] args - Argument Array object.
 *  
 ********************/
	public static void main(String[] args) {
		
		
/********************
 * 
 *  Variable - local variable
 * 
 * 	variable (variable type) <int> 
 * 	identifier (variable name) <intAge> 
 * 	value (variable value) <55>;
 * 
 *  int intAge = 55; //integer
 * 
 ********************/
		int intAge = 55; //integer
		boolean blFlage = false; //boolean
		char grade = 'A'; //char
		char gardeNumber = 67; //char	
		String StSayHello = "Hello";	// String sequence of characters.		
		int hh=16, mm=34, ss=34, ms=55;
		
		
		//creating a new instance of the class
		A_javaBasicVariable a = new A_javaBasicVariable();
		
		
		//print to console.
		System.out.println("integer " + intAge);
		System.out.println("boolean " + blFlage);
		System.out.println("char " + grade);
		System.out.println("My Age is " + intAge);
		System.out.println("the time is:  " + hh + ":" + mm + ":" + ss +  ":" + ms);
		
		
		System.out.println("\nVariable max value:");
		
		System.out.println("Byte == " + Byte.MIN_VALUE + " <--> " + Byte.MAX_VALUE); 
		System.out.println("Short == " + Short.MIN_VALUE + " <--> " + Short.MAX_VALUE);
		System.out.println("int / Integer == " + Integer.MIN_VALUE + " <--> " + Integer.MAX_VALUE);
		System.out.println("Long == " + Long.MIN_VALUE + " <--> " + Long.MAX_VALUE);	
		System.out.println("char / Character == " + Character.MIN_VALUE + " <--> " + Character.MAX_VALUE);
		
        System.out.println("Float == " + Float.MIN_VALUE + " <--> " + Float.MAX_VALUE);
        System.out.println("Double == " + Double.MIN_VALUE + " <--> " + Double.MAX_VALUE);
	
        //static variable (no need for instance of the class.
        intCount++;
        intCount++;
        System.out.println("Calling static variable: intCount++ : "  + intCount);
        
/********************
 * 
 * variables Reserved words - cannot be used as variable identifier (variable name)
 * 
 * abstract, continue, for, new, switch, assert, default, goto, package, synchronized,
 * boolean, do, if, private, this, break, double, implements, protected, throw,
 * byte, else, import,	public,	throws, case, enum, instanceof, return, transient
 * catch, extends, int	short, try, char, final, interface, static, void,
 * class, finally, long, strictfp, volatile, const, float, native, super, while
 * 
 ********************/
				
	}
}
