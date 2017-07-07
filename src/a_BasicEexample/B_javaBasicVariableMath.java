
/**********
 *
 * B_javaBasicVariableMath.java
 * 
 *********/


package a_BasicEexample;


public class B_javaBasicVariableMath {

	
	/**********
	 * 
	 * PreFix PostFix Method
	 * 
	 * prefix - change the variable value and assign the new value to another variable
	 * postfix  - assign the variable old value to another variable and then change the variable value
	 * 
	 **********/
	public void methodPrePostFix(){
		//
		//++increment++
		//--decrement--		
		//
		//prefix
		int a = 2;
		int b = ++a; // a=3, b=3
		System.out.println("prefix >> a = 2, b = ++a ====> a== " + a + " b== " + b);
		//
		//postfix
		int c = 3;
		int d = c--; // d=3 c=2
		System.out.println("postfix >> c = 3, d = c-- ====> c== " + c + " d == " + d);	
	}

	
	
	/**********
	 * 
	 * Java Arithmetic Operators
	 * 
	 * +  addition
	 * -  subtraction 
	 * *  multiplication
	 * /  devision 
	 * %  modulo 
	 * 
	 **********/
	public void JavaArithmeticOperators()
	{
		System.out.println("6 + 2 = " + (6 + 2));
		System.out.println("6 - 2 = " + (6 - 2));
		System.out.println("6 * 2 = " + (6 * 2));
		System.out.println("6 / 2 = (6.0)" + (6 / 2));
		System.out.println("6 % 2 = (6.0)" + (6 % 2));
	}
	
	
	//main method
	public static void main(String[] args) {
		//object
		B_javaBasicVariableMath b = new B_javaBasicVariableMath();
		b.JavaArithmeticOperators();
		b.methodPrePostFix();
		
	}

}


